package Db;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class c extends Exception {
    @Override // java.lang.Throwable
    public final String toString() {
        Throwable cause = getCause();
        if (cause != null) {
            String message = getCause().getMessage();
            return message != null ? message : cause.toString();
        }
        String message2 = getMessage();
        return message2 != null ? message2 : super.toString();
    }
}
