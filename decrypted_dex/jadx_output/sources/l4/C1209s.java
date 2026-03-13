package l4;

/* renamed from: l4.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1209s {

    /* renamed from: a, reason: collision with root package name */
    public final String f16609a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16611c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16612d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16613e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16614f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16615g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f16616h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f16617i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f16618k;

    public C1209s(String str, String str2, long j, long j3, long j10, long j11, long j12, Long l9, Long l10, Long l11, Boolean bool) {
        S3.D.e(str);
        S3.D.e(str2);
        S3.D.b(j >= 0);
        S3.D.b(j3 >= 0);
        S3.D.b(j10 >= 0);
        S3.D.b(j12 >= 0);
        this.f16609a = str;
        this.f16610b = str2;
        this.f16611c = j;
        this.f16612d = j3;
        this.f16613e = j10;
        this.f16614f = j11;
        this.f16615g = j12;
        this.f16616h = l9;
        this.f16617i = l10;
        this.j = l11;
        this.f16618k = bool;
    }

    public final C1209s a(long j) {
        return new C1209s(this.f16609a, this.f16610b, this.f16611c, this.f16612d, this.f16613e, j, this.f16615g, this.f16616h, this.f16617i, this.j, this.f16618k);
    }

    public final C1209s b(Long l9, Long l10, Boolean bool) {
        return new C1209s(this.f16609a, this.f16610b, this.f16611c, this.f16612d, this.f16613e, this.f16614f, this.f16615g, this.f16616h, l9, l10, bool);
    }
}
