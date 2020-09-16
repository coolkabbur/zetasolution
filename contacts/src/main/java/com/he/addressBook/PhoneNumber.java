package com.he.addressBook;

import sun.security.util.Length;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + label + ", "
			+ "phone=" + phoneNumber + ", "
			+ (phoneNumber != null ? "phoneNumber=" + phoneNumber : "");
	}

	public void validate() {
		if (label.length()>255) {
			throw new RuntimeException("Label is not exced 255 charcter");
		}
		if (isNullOrEmpty(this.phoneNumber)) {
			throw new RuntimeException("Phone is mandatory");			
		}
		if (phoneNumber.length()<10) {
			throw new RuntimeException("Enter valid number");			
		}
	}

	private boolean isNullOrEmpty(String value) {
		return value == null || value.trim().isEmpty();
	}
}
