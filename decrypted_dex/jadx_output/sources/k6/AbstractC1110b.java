package k6;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1110b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15453a = {2, 1, 4, 3};

    public static boolean a(int i3, int i10, int i11) {
        switch (i3) {
            case 1:
                if (((i10 + i11) & 1) == 0) {
                }
                break;
            case 2:
                if ((i10 & 1) == 0) {
                }
                break;
            case 3:
                if (i11 % 3 == 0) {
                }
                break;
            case 4:
                if ((i10 + i11) % 3 == 0) {
                }
                break;
            case 5:
                if ((((i11 / 3) + (i10 / 2)) & 1) == 0) {
                }
                break;
            case 6:
                if ((i10 * i11) % 6 == 0) {
                }
                break;
            case 7:
                if ((i10 * i11) % 6 < 3) {
                }
                break;
            default:
                if (((((i10 * i11) % 3) + i10 + i11) & 1) == 0) {
                }
                break;
        }
        return true;
    }
}
