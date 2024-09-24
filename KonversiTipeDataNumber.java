public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        // Narrowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        // Number overflow
        int tipeDataInteger = 128;
        short tipeDataByteConverted = (short) tipeDataInteger;
        System.out.println(tipeDataByteConverted);
    }
}