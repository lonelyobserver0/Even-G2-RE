package okhttp3.internal.publicsuffix;

import C2.i;
import Ec.n;
import Kc.AbstractC0095b;
import Kc.B;
import Kc.C0098e;
import Kc.J;
import Kc.q;
import Kc.v;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "C2/i", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f18654e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f18655f = CollectionsKt.listOf(StubApp.getString2(602));

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f18656g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f18657a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f18658b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f18659c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f18660d;

    public static List c(String str) {
        List split$default;
        List dropLast;
        split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual(CollectionsKt.last(split$default), "")) {
            return split$default;
        }
        dropLast = CollectionsKt___CollectionsKt.dropLast(split$default, 1);
        return dropLast;
    }

    public final String a(String domain) {
        String string2;
        String str;
        String str2;
        String str3;
        List split$default;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List c10 = c(unicodeDomain);
        if (this.f18657a.get() || !this.f18657a.compareAndSet(false, true)) {
            try {
                this.f18658b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        try {
                            b();
                            break;
                        } catch (IOException e10) {
                            n nVar = n.f2161a;
                            n nVar2 = n.f2161a;
                            String string22 = StubApp.getString2("26684");
                            nVar2.getClass();
                            n.i(string22, 5, e10);
                            if (z2) {
                            }
                        }
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f18659c == null) {
            throw new IllegalStateException(StubApp.getString2(26686));
        }
        int size = c10.size();
        byte[][] bArr = new byte[size][];
        for (int i3 = 0; i3 < size; i3++) {
            String str4 = (String) c10.get(i3);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i3] = bytes;
        }
        int i10 = 0;
        while (true) {
            string2 = StubApp.getString2(26685);
            if (i10 >= size) {
                str = null;
                break;
            }
            int i11 = i10 + 1;
            byte[] bArr2 = this.f18659c;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bArr2 = null;
            }
            str = i.r(bArr2, bArr, i10);
            if (str != null) {
                break;
            }
            i10 = i11;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12 + 1;
                bArr3[i12] = f18654e;
                byte[] bArr4 = this.f18659c;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bArr4 = null;
                }
                str2 = i.r(bArr4, bArr3, i12);
                if (str2 != null) {
                    break;
                }
                i12 = i13;
            }
        }
        str2 = null;
        if (str2 != null) {
            int i14 = size - 1;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                byte[] bArr5 = this.f18660d;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                str3 = i.r(bArr5, bArr, i15);
                if (str3 != null) {
                    break;
                }
                i15 = i16;
            }
        }
        str3 = null;
        if (str3 != null) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) Intrinsics.stringPlus("!", str3), new char[]{'.'}, false, 0, 6, (Object) null);
        } else if (str == null && str2 == null) {
            split$default = f18655f;
        } else {
            List split$default2 = str == null ? null : StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
            if (split$default2 == null) {
                split$default2 = CollectionsKt.emptyList();
            }
            split$default = str2 == null ? null : StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null);
            if (split$default == null) {
                split$default = CollectionsKt.emptyList();
            }
            if (split$default2.size() > split$default.size()) {
                split$default = split$default2;
            }
        }
        if (c10.size() == split$default.size() && ((String) split$default.get(0)).charAt(0) != '!') {
            return null;
        }
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(c(domain)), ((String) split$default.get(0)).charAt(0) == '!' ? c10.size() - split$default.size() : c10.size() - (split$default.size() + 1)), StubApp.getString2(1), null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(StubApp.getString2(26687));
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = v.f3853a;
        Intrinsics.checkNotNullParameter(resourceAsStream, "<this>");
        B d8 = AbstractC0095b.d(new q(new C0098e(resourceAsStream, new J())));
        try {
            long readInt = d8.readInt();
            d8.D(readInt);
            byte[] A4 = d8.f3774b.A(readInt);
            long readInt2 = d8.readInt();
            d8.D(readInt2);
            byte[] A5 = d8.f3774b.A(readInt2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(d8, null);
            synchronized (this) {
                Intrinsics.checkNotNull(A4);
                this.f18659c = A4;
                Intrinsics.checkNotNull(A5);
                this.f18660d = A5;
            }
            this.f18658b.countDown();
        } finally {
        }
    }
}
