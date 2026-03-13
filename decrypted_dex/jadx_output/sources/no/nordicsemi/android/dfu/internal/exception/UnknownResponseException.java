package no.nordicsemi.android.dfu.internal.exception;

import com.stub.StubApp;
import java.util.Locale;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UnknownResponseException extends Exception {
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final long serialVersionUID = -8716125467309979289L;
    private final int mExpectedOpCode;
    private final int mExpectedReturnCode;
    private final byte[] mResponse;

    public UnknownResponseException(String str, byte[] bArr, int i3, int i10) {
        super(str);
        this.mResponse = bArr == null ? new byte[0] : bArr;
        this.mExpectedReturnCode = i3;
        this.mExpectedOpCode = i10;
    }

    public static String bytesToHex(byte[] bArr, int i3, int i10) {
        if (bArr == null || bArr.length <= i3 || i10 <= 0) {
            return "";
        }
        int min = Math.min(i10, bArr.length - i3);
        char[] cArr = new char[min * 2];
        for (int i11 = 0; i11 < min; i11++) {
            byte b2 = bArr[i3 + i11];
            int i12 = b2 & UByte.MAX_VALUE;
            int i13 = i11 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i13] = cArr2[i12 >>> 4];
            cArr[i13 + 1] = cArr2[b2 & 15];
        }
        return StubApp.getString2(463).concat(new String(cArr));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Locale locale = Locale.US;
        String message = super.getMessage();
        byte[] bArr = this.mResponse;
        return String.format(locale, StubApp.getString2(26681), message, bytesToHex(bArr, 0, bArr.length), Integer.valueOf(this.mExpectedReturnCode), Integer.valueOf(this.mExpectedOpCode));
    }
}
