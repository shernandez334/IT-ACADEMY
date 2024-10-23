package Module1_Patterns.L2Exercise1.factory;

import Module1_Patterns.L2Exercise1.address.AddressFrance;
import Module1_Patterns.L2Exercise1.address.AddressUsa;

public interface AddressFactory {
    AddressFrance createAddressFrance();
    AddressUsa createAddressUsa();
}