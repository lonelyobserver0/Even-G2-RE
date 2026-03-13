package c5;

import android.content.Context;
import com.stub.StubApp;
import f5.T;
import f5.U;
import f5.V;
import f5.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10940f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f10941g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10942a;

    /* renamed from: b, reason: collision with root package name */
    public final y f10943b;

    /* renamed from: c, reason: collision with root package name */
    public final B6.a f10944c;

    /* renamed from: d, reason: collision with root package name */
    public final Y.m f10945d;

    /* renamed from: e, reason: collision with root package name */
    public final A3.s f10946e;

    static {
        HashMap hashMap = new HashMap();
        f10940f = hashMap;
        AbstractC1482f.q(5, hashMap, StubApp.getString2(9457), 6, StubApp.getString2(9456));
        AbstractC1482f.q(9, hashMap, StubApp.getString2(9458), 0, StubApp.getString2(9459));
        hashMap.put(StubApp.getString2(9569), 1);
        Locale locale = Locale.US;
        f10941g = StubApp.getString2(9556);
    }

    public s(Context context, y yVar, B6.a aVar, Y.m mVar, A3.s sVar) {
        this.f10942a = context;
        this.f10943b = yVar;
        this.f10944c = aVar;
        this.f10945d = mVar;
        this.f10946e = sVar;
    }

    public static U c(p2.h hVar, int i3) {
        String str = (String) hVar.f19672b;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f19673c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        p2.h hVar2 = (p2.h) hVar.f19674d;
        if (i3 >= 8) {
            for (p2.h hVar3 = hVar2; hVar3 != null; hVar3 = (p2.h) hVar3.f19674d) {
                i10++;
            }
        }
        int i11 = i10;
        List d8 = d(stackTraceElementArr, 4);
        if (d8 == null) {
            throw new NullPointerException(StubApp.getString2(9571));
        }
        byte b2 = (byte) (0 | 1);
        U u2 = null;
        if (hVar2 != null && i11 == 0) {
            u2 = c(hVar2, i3 + 1);
        }
        if (b2 == 1) {
            return new U(str, (String) hVar.f19671a, d8, u2, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(StubApp.getString2(9570));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i3) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            X x7 = new X();
            x7.f13939e = i3;
            x7.f13940f = (byte) (x7.f13940f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + StubApp.getString2(1) + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            x7.f13935a = max;
            byte b2 = (byte) (x7.f13940f | 1);
            x7.f13940f = b2;
            if (str == null) {
                throw new NullPointerException(StubApp.getString2(9572));
            }
            x7.f13936b = str;
            x7.f13937c = fileName;
            x7.f13938d = j;
            x7.f13940f = (byte) (b2 | 2);
            arrayList.add(x7.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static V e() {
        byte b2 = (byte) 1;
        if (b2 == 1) {
            String string2 = StubApp.getString2(824);
            return new V(0L, string2, string2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b2 == 0) {
            sb2.append(StubApp.getString2(9573));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }

    public final List a() {
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        B6.a aVar = this.f10944c;
        String str = (String) aVar.f671e;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(9576));
        }
        if (b2 == 3) {
            return Collections.singletonList(new T(0L, 0L, str, (String) aVar.f669c));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(StubApp.getString2(9574));
        }
        if ((b2 & 2) == 0) {
            sb2.append(StubApp.getString2(9575));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f5.C0892c0 b(int r17) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.s.b(int):f5.c0");
    }
}
