package W9;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8197a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f8198b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f8199c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f8200d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f8201e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f8202f;

    static {
        a aVar = new a(StubApp.getString2(6931), 0);
        f8197a = aVar;
        a aVar2 = new a(StubApp.getString2(6932), 1);
        f8198b = aVar2;
        a aVar3 = new a(StubApp.getString2(6933), 2);
        f8199c = aVar3;
        a aVar4 = new a(StubApp.getString2(6934), 3);
        f8200d = aVar4;
        a aVar5 = new a(StubApp.getString2(6935), 4);
        f8201e = aVar5;
        f8202f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8202f.clone();
    }
}
