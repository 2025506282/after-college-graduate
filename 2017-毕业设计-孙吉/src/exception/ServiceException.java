package exception;

import constant.CommmonConstant;

public class ServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception excption) {
		super(CommmonConstant.SRERVICE_IS_WRONG, excption);
	}

	public ServiceException(String message, Exception exception) {
		super(message, exception);
	}

}
