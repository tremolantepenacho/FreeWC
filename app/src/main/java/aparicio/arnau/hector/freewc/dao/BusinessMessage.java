package aparicio.arnau.hector.freewc.dao;

/**
 * Created by hector on 9/08/17.
 */

public class BusinessMessage implements Comparable<BusinessMessage> {
      private final String fieldName;
      private final String message;

              public BusinessMessage(String fieldName, String message) {
                 if (message==null) {
                     throw new IllegalArgumentException("message no puede ser null");
                 }

                 if ((fieldName!=null) && (fieldName.trim().equals(""))) {
                     this.fieldName =null;
                 } else {
                    // this.fieldName = StringUtils.capitalize(fieldName);
                     this.fieldName=fieldName;
                 }
                 //this.message = StringUtils.capitalize(message);
                  this.message=message;
             }

@Override
     public String toString() {
         if (fieldName!=null) {
             return "'"+fieldName+ "'-"+message;
         } else {
             return message;
         }
     }

/**
      * @return the fieldName
      */
     public String getFieldName() {
         return fieldName;
     }

     /**
      * @return the message
      */
     public String getMessage() {
       return message;
     }


     @Override
    public int compareTo(BusinessMessage o) {
         if ((getFieldName()==null) && (o.getFieldName()==null)) {
             return getMessage().compareTo(o.getMessage());
         } else if ((getFieldName()==null) && (o.getFieldName()!=null)) {
             return 1;
         } else if ((getFieldName()!=null) && (o.getFieldName()==null)) {
             return -1;
         } else if ((getFieldName()!=null) && (o.getFieldName()!=null)) {
             if (getFieldName().equals(o.getFieldName())) {
                return getMessage().compareTo(o.getMessage());
             } else {
                 return getFieldName().compareTo(o.getFieldName());
             }
         } else {
            throw new RuntimeException("Error de lógica");
         }
     }


}
