package Module1_Patterns.L2Exercise1.factory;


import Module1_Patterns.L2Exercise1.phoneNumber.PhoneNumberFrance;
import Module1_Patterns.L2Exercise1.phoneNumber.PhoneNumberUsa;

public interface PhoneNumberFactory {
    PhoneNumberFrance createPhoneNumberFrance();
    PhoneNumberUsa createPhoneNumberUsa();
}
