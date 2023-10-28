package ReflectionTask;

import java.lang.reflect.Field;

public class Person {

    static void convert(Object sourceObject, Object destinationObject) throws IllegalAccessException {


        Field[] sourceFields = sourceObject.getClass().getDeclaredFields();
        Field[] destinationFields = destinationObject.getClass().getDeclaredFields();

        for (Field field : destinationFields) {
            field.setAccessible(true);

            for (Field field2 : sourceFields) {

                if (field2.getName().equals(field.getName())) {

                    if (equalsType(field, field2)) {

                        field.set(destinationObject, field2.get(sourceObject));

                    } else {

                        String destinationFieldType = getDataType(field);
                        String sourceFieldType = getDataType(field2);

                        if ((sourceFieldType.equals("int") || sourceFieldType.equals("long")
                                || sourceFieldType.equals("float") || sourceFieldType.equals("double"))
                                && destinationFieldType.equals("String")) {

                            String sourcevalue = numberToString(field2, sourceObject);
                            field.set(destinationObject, sourcevalue);

                        } else if (sourceFieldType.equals("String") && destinationFieldType.equals("int")) {

                            int sourcevalue = stringToInteger(field2, sourceObject);
                            field.set(destinationObject, sourcevalue);

                        } else if (sourceFieldType.equals("boolean") && destinationFieldType.equals("String")) {

                            String sourcevalue = booleanToString(field2, sourceObject);
                            field.set(destinationObject, sourcevalue);

                        } else if (sourceFieldType.equals("String") && destinationFieldType.equals("boolean")) {

                            boolean sourcevalue = stringToBoolean(field2, sourceObject);
                            field.set(destinationObject, sourcevalue);

                        }

                    }
                }
            }
        }

        printField(destinationFields, destinationObject);
    }
    

    static String numberToString(Field field, Object srcObj) throws IllegalAccessException {
        String str = null;
        str = String.valueOf(field.get(srcObj));

        return str;
    }

    static int stringToInteger(Field field, Object srcObj) throws IllegalAccessException {
        int value = 0;
        value = Integer.parseInt((String) field.get(srcObj));

        return value;
    }

    static String booleanToString(Field field, Object srcObj) throws IllegalAccessException {
        String str = null;
        str = String.valueOf((boolean) field.get(srcObj));

        return str;
    }

    static boolean stringToBoolean(Field field, Object srcObj) throws IllegalAccessException {
        boolean bool = false;
        bool = Boolean.parseBoolean((String) field.get(srcObj));

        return bool;
    }

    static String getDataType(Field field) {
        return field.getType().getSimpleName();
    }

    static void printField(Field[] fields, Object obj) {
        for (Field field : fields) {
            try {
                System.out.println(field.getName() + " : " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    static boolean equalsType(Field field1, Field field2) {
        String firstFieldType = field1.getType().getSimpleName();
        String secondFieldType = field2.getType().getSimpleName();

        if (firstFieldType.equals(secondFieldType)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {

        convert(new Student(), new Employee());

    }
}
