//package com.importnew.filterNew.util;
//
//import org.springframework.validation.Validator;
//
//public class ValidatorUtil {
//	
//	private static Validator validator = ((HibernateValidatorConfiguration) Validation
//            .byProvider(HibernateValidator.class).configure()).failFast(true).buildValidatorFactory().getValidator();
// 
//    /**
//     * 实体校验
//     * 
//     * @param obj
//     * @throws CommonException
//     */
//    public static <T> void validate(T obj) throws CommonException {
//        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj, new Class[0]);
//        if (constraintViolations.size() > 0) {
//            ConstraintViolation<T> validateInfo = (ConstraintViolation<T>) constraintViolations.iterator().next();
//            // validateInfo.getMessage() 校验不通过时的信息，即message对应的值
//            throw new CommonException("0001", validateInfo.getMessage());
//        }
//    }
//
//}
