package aparicio.arnau.hector.freewc.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hector on 9/08/17.
 */

public class BusinessException extends Exception {

    private Set<BusinessMessage> businessMessages = new TreeSet<>();

    public BusinessException(List<BusinessMessage> businessMessages) {
        this.businessMessages.addAll(businessMessages);
         }

    public BusinessException(BusinessMessage businessMessage) {
        this.businessMessages.add(businessMessage);
        }

             public BusinessException(Exception ex) {
                 businessMessages.add(new BusinessMessage(null, ex.toString()));
             }

           /*  public BussinessException(javax.validation.ConstraintViolationException cve) {
                 for (ConstraintViolation constraintViolation : cve.getConstraintViolations()) {
                     String fieldName;
                     String message;

                     fieldName = getCaptions(constraintViolation.getRootBeanClass(), constraintViolation.getPropertyPath());
                     message = constraintViolation.getMessage();

                      bussinessMessages.add(new BussinessMessage(fieldName, message));
                  }
             }

       public BussinessException(org.hibernate.exception.ConstraintViolationException cve) {
           bussinessMessages.add(new BussinessMessage(null, cve.getLocalizedMessage()));
       }*/
     public Set<BusinessMessage> getBusinessMessages() {
         return businessMessages;
     }
}