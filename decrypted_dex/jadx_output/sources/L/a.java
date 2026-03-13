package L;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3862e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3864b;

    /* renamed from: c, reason: collision with root package name */
    public int f3865c;

    /* renamed from: d, reason: collision with root package name */
    public char f3866d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f3862e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f3863a = charSequence;
        this.f3864b = charSequence.length();
    }

    public final byte a() {
        int i3 = this.f3865c - 1;
        CharSequence charSequence = this.f3863a;
        char charAt = charSequence.charAt(i3);
        this.f3866d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3865c);
            this.f3865c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3865c--;
        char c10 = this.f3866d;
        return c10 < 1792 ? f3862e[c10] : Character.getDirectionality(c10);
    }
}
