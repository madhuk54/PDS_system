package PDS_system;

public class Aadhaar {

    public static void main(String[] args) {
        
        String aadhaar = "123412341234";

        
        if (aadhaar.length() != 12 || !aadhaar.matches("\\d+")) {
            System.out.println("Invalid Aadhaar number.");
            return;
        }

        
        String otp = generateOTP();
        System.out.println(" OTP sent to registered mobile (simulated): " + otp);

        
        String enteredOtp = otp;  
        

        
        if (otp.equals(enteredOtp)) {
            System.out.println(" Aadhaar verified successfully.");
        } else {
            System.out.println(" OTP verification failed.");
        }
    }

    
    public static String generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000; 
        return String.valueOf(otp);
    }
}
