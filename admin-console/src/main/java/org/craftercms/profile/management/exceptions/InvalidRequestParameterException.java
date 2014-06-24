package org.craftercms.profile.management.exceptions;

/**
 * Thrown when a request parameter is invalid.
 *
 * @author avasquez
 */
public class InvalidRequestParameterException extends RuntimeException {

    public InvalidRequestParameterException(String message) {
        super(message);
    }

}
