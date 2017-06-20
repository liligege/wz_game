package util;

public class CodecUtil {
    // private static final int MAXN = 256;
    private static final int ENCODE_BOX[] = new int[] { // 
    0x85, 0xC8, 0x76, 0xAE, 0x41, 0x22, 0xD6, 0x9F, 0x47, 0x2C, 0x0C, 0x5D, 0x7E, 0x9A, 0xEB, 0x1D, // 
        0xA2, 0x12, 0x5F, 0x6C, 0xFE, 0xE2, 0x8C, 0x65, 0xBB, 0x4B, 0x5C, 0xA4, 0x3D, 0x1F, 0x53, 0x94, // 
        0x20, 0xDA, 0x96, 0x3C, 0xEE, 0x58, 0x77, 0xD9, 0x90, 0x46, 0x01, 0xF3, 0x29, 0xF2, 0x3F, 0x78, // 
        0xA5, 0x45, 0x02, 0xE7, 0x80, 0xDE, 0xD7, 0x59, 0xCB, 0xE0, 0xDB, 0xFD, 0xDD, 0xE4, 0x4D, 0x08, // 
        0x37, 0x2A, 0xE8, 0x71, 0x97, 0xD4, 0xBA, 0xAC, 0xB4, 0xA6, 0x8F, 0x25, 0x16, 0x1B, 0x23, 0x67, // 
        0xC0, 0x73, 0x11, 0x05, 0xB9, 0xBE, 0x34, 0x5E, 0xE1, 0xFB, 0x13, 0x51, 0xCD, 0x4F, 0x92, 0x7C, // 
        0xE3, 0x0D, 0x83, 0x69, 0xF5, 0xD1, 0x27, 0x18, 0x4A, 0x86, 0x07, 0x0B, 0x87, 0xC7, 0xAF, 0x68, // 
        0x44, 0x89, 0x57, 0x28, 0xED, 0xA9, 0xAD, 0x09, 0x5A, 0xC9, 0x0E, 0x74, 0xA0, 0xFF, 0x88, 0xEA, // 
        0x48, 0x00, 0xC4, 0xC3, 0x98, 0xB1, 0x1C, 0x61, 0x49, 0x2B, 0x32, 0x63, 0x56, 0x60, 0x03, 0x2F, // 
        0xEF, 0x0A, 0xF0, 0x35, 0xCC, 0x2E, 0xF6, 0x26, 0x2D, 0x50, 0x10, 0xE6, 0x9C, 0xB8, 0x84, 0x14, // 
        0xBF, 0x7B, 0x8B, 0xD8, 0xCF, 0x75, 0xA8, 0x8A, 0x43, 0x5B, 0xF8, 0x7D, 0x30, 0xFA, 0x1E, 0x6D, // 
        0x7F, 0xF7, 0xD5, 0x3A, 0x66, 0xB3, 0xCA, 0x24, 0x6E, 0x39, 0x79, 0x1A, 0x91, 0x21, 0x99, 0x15, // 
        0xC6, 0xB0, 0xF4, 0xE5, 0x7A, 0xA1, 0x8E, 0xF1, 0x0F, 0xB6, 0x95, 0xDF, 0x36, 0x3E, 0xC2, 0xAA, // 
        0x93, 0xD2, 0x40, 0xB7, 0x4C, 0xD0, 0x9D, 0x62, 0x31, 0x19, 0x17, 0xAB, 0x3B, 0x33, 0xFC, 0xB2, // 
        0x4E, 0x8D, 0x72, 0x82, 0x42, 0xC5, 0x9E, 0xBD, 0xCE, 0xF9, 0x06, 0x38, 0x04, 0xA7, 0x81, 0x54, // 
        0x6A, 0xEC, 0x6F, 0xBC, 0xD3, 0x9B, 0xB5, 0x70, 0x64, 0xA3, 0xE9, 0x52, 0x55, 0x6B, 0xDC, 0xC1, // 
    };
    private static final int DECODE_BOX[] = new int[] { // 
    0x81, 0x2A, 0x32, 0x8E, 0xEC, 0x53, 0xEA, 0x6A, 0x3F, 0x77, 0x91, 0x6B, 0x0A, 0x61, 0x7A, 0xC8, // 
        0x9A, 0x52, 0x11, 0x5A, 0x9F, 0xBF, 0x4C, 0xDA, 0x67, 0xD9, 0xBB, 0x4D, 0x86, 0x0F, 0xAE, 0x1D, // 
        0x20, 0xBD, 0x05, 0x4E, 0xB7, 0x4B, 0x97, 0x66, 0x73, 0x2C, 0x41, 0x89, 0x09, 0x98, 0x95, 0x8F, // 
        0xAC, 0xD8, 0x8A, 0xDD, 0x56, 0x93, 0xCC, 0x40, 0xEB, 0xB9, 0xB3, 0xDC, 0x23, 0x1C, 0xCD, 0x2E, // 
        0xD2, 0x04, 0xE4, 0xA8, 0x70, 0x31, 0x29, 0x08, 0x80, 0x88, 0x68, 0x19, 0xD4, 0x3E, 0xE0, 0x5D, // 
        0x99, 0x5B, 0xFB, 0x1E, 0xEF, 0xFC, 0x8C, 0x72, 0x25, 0x37, 0x78, 0xA9, 0x1A, 0x0B, 0x57, 0x12, // 
        0x8D, 0x87, 0xD7, 0x8B, 0xF8, 0x17, 0xB4, 0x4F, 0x6F, 0x63, 0xF0, 0xFD, 0x13, 0xAF, 0xB8, 0xF2, // 
        0xF7, 0x43, 0xE2, 0x51, 0x7B, 0xA5, 0x02, 0x26, 0x2F, 0xBA, 0xC4, 0xA1, 0x5F, 0xAB, 0x0C, 0xB0, // 
        0x34, 0xEE, 0xE3, 0x62, 0x9E, 0x00, 0x69, 0x6C, 0x7E, 0x71, 0xA7, 0xA2, 0x16, 0xE1, 0xC6, 0x4A, // 
        0x28, 0xBC, 0x5E, 0xD0, 0x1F, 0xCA, 0x22, 0x44, 0x84, 0xBE, 0x0D, 0xF5, 0x9C, 0xD6, 0xE6, 0x07, // 
        0x7C, 0xC5, 0x10, 0xF9, 0x1B, 0x30, 0x49, 0xED, 0xA6, 0x75, 0xCF, 0xDB, 0x47, 0x76, 0x03, 0x6E, // 
        0xC1, 0x85, 0xDF, 0xB5, 0x48, 0xF6, 0xC9, 0xD3, 0x9D, 0x54, 0x46, 0x18, 0xF3, 0xE7, 0x55, 0xA0, // 
        0x50, 0xFF, 0xCE, 0x83, 0x82, 0xE5, 0xC0, 0x6D, 0x01, 0x79, 0xB6, 0x38, 0x94, 0x5C, 0xE8, 0xA4, // 
        0xD5, 0x65, 0xD1, 0xF4, 0x45, 0xB2, 0x06, 0x36, 0xA3, 0x27, 0x21, 0x3A, 0xFE, 0x3C, 0x35, 0xCB, // 
        0x39, 0x58, 0x15, 0x60, 0x3D, 0xC3, 0x9B, 0x33, 0x42, 0xFA, 0x7F, 0x0E, 0xF1, 0x74, 0x24, 0x90, // 
        0x92, 0xC7, 0x2D, 0x2B, 0xC2, 0x64, 0x96, 0xB1, 0xAA, 0xE9, 0xAD, 0x59, 0xDE, 0x3B, 0x14, 0x7D, // 
    };

    private static void processBuffer(byte[] buffer, int offset, int length, int[] box) {
        if (buffer == null) {
            return;
        }
        if (offset < 0 || length < 0 || offset + length > buffer.length) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < length; ++i) {
            buffer[i + offset] = (byte) (box[buffer[i + offset] & 0xFF] & 0xFF);
        }
    }

    public static void encodeBuffer(byte[] buffer) {
        if (buffer != null) {
            encodeBuffer(buffer, 0, buffer.length);
        }
    }

    public static void encodeBuffer(byte[] buffer, int offset, int length) {
        processBuffer(buffer, offset, length, ENCODE_BOX);
    }

    public static void decodeBuffer(byte[] buffer) {
        if (buffer != null) {
            decodeBuffer(buffer, 0, buffer.length);
        }
    }

    public static void decodeBuffer(byte[] buffer, int offset, int length) {
        processBuffer(buffer, offset, length, DECODE_BOX);
    }

    public static int getCheckSum(int id, byte[] buffer, int offset, int length) {
        if (buffer == null) {
            return 0;
        }
        if (offset < 0 || length < 0 || offset + length > buffer.length) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
//        for (int i = 0; i < length; ++i) {
//            sum = ((((sum << 1) ^ (buffer[i + offset] & 0xFF)) & 0xFFFF) + ((sum >> 8) & 0xFFFF) + (id & 0xFFFF)) & 0xFFFF;
//        }
        CRC16CCITT crc = new CRC16CCITT();
        crc.update(buffer, offset, length);
        sum = crc.getValue();
//        for (int i = 0; i < length; ++i) {
//            sum = ((((sum << 1) ^ (buffer[i + offset] & 0xFF)) & 0xFFFF) + ((sum >> 8) & 0xFFFF) + (id & 0xFFFF)) & 0xFFFF;
//        }
        sum = ((sum * 31 + id) & 0xFFFF);

        return sum;
    }

}
