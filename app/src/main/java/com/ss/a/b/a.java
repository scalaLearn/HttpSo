package com.ss.a.b;

/**
 * @author heyaug
 */
public final class a {
    public static String a(byte[] arg6) {
        if (arg6 == null) {
            return null;
        }

        char[] v0 = "0123456789abcdef".toCharArray();
        char[] v1 = new char[arg6.length * 2];
        int v2;
        for (v2 = 0; v2 < arg6.length; ++v2) {
            int v3 = arg6[v2] & 0xFF;
            int v4 = v2 * 2;
            v1[v4] = v0[v3 >>> 4];
            v1[v4 + 1] = v0[v3 & 15];
        }

        return new String(v1);
    }

    public static byte[] a(String arg7) {
        int v0 = arg7.length();
        byte[] v1 = new byte[v0 / 2];
        int v2;
        for (v2 = 0; v2 < v0; v2 += 2) {
            v1[v2 / 2] = ((byte) ((Character.digit(arg7.charAt(v2), 16) << 4) + Character.digit(arg7.charAt(v2 + 1), 16)));
        }
        return v1;
    }

    public static byte[] a(byte[][] arg8) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 2;
        while (true) {
            if (v1 >= v3) {
                break;
            }
            v2 += arg8[v1].length;
            ++v1;
        }
        byte[] v1_1 = new byte[v2];
        v2 = 0;
        int v4 = 0;
        while (v2 < v3) {
            byte[] v5 = arg8[v2];
            System.arraycopy(v5, 0, v1_1, v4, v5.length);
            v4 += v5.length;
            ++v2;
        }
        return v1_1;
    }
}

