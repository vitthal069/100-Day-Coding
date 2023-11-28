class Solution {
    public String defangIPaddr(String address) {
     StringBuilder defangedAddress = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defangedAddress.append("[.]");
            } else {
                defangedAddress.append(address.charAt(i));
            }
        }

        return defangedAddress.toString();  
    }
}