package Rc;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Rc.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class EnumC0259h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0252a f6396a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0253b f6397b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0254c f6398c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0255d f6399d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0259h[] f6400e;

    static {
        C0252a c0252a = new C0252a();
        f6396a = c0252a;
        C0253b c0253b = new C0253b();
        f6397b = c0253b;
        C0254c c0254c = new C0254c();
        f6398c = c0254c;
        C0255d c0255d = new C0255d();
        f6399d = c0255d;
        f6400e = new EnumC0259h[]{c0252a, c0253b, c0254c, c0255d, new EnumC0259h() { // from class: Rc.e
            {
                StubApp.getString2(25578);
            }
        }, new EnumC0259h() { // from class: Rc.f
            {
                StubApp.getString2(25579);
            }
        }, new EnumC0259h() { // from class: Rc.g
            {
                StubApp.getString2(25580);
            }
        }};
    }

    public static EnumC0259h valueOf(String str) {
        return (EnumC0259h) Enum.valueOf(EnumC0259h.class, str);
    }

    public static EnumC0259h[] values() {
        return (EnumC0259h[]) f6400e.clone();
    }
}
