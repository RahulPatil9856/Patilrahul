package Exceptionhandling;

public class InvalidVoterException extends RuntimeException {
	InvalidVoterException(String str)
	{
		super(str);
	}

}
