package com.even.even_core.utils.room;

import J1.d;
import J1.m;
import J1.u;
import O0.l;
import O1.c;
import P2.a;
import Q2.g;
import android.content.Context;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EvDatabase_Impl extends EvDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile g f11135m;

    @Override // J1.r
    public final m d() {
        return new m(this, new HashMap(0), new HashMap(0), StubApp.getString2(4844));
    }

    @Override // J1.r
    public final c e(d dVar) {
        u callback = new u(dVar, new a(this), StubApp.getString2(10027), StubApp.getString2(10028));
        Context context = dVar.f3308a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return dVar.f3310c.p(new l(context, dVar.f3309b, callback, false));
    }

    @Override // J1.r
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // J1.r
    public final Set h() {
        return new HashSet();
    }

    @Override // J1.r
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(g.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // com.even.even_core.utils.room.EvDatabase
    public final g p() {
        g gVar;
        if (this.f11135m != null) {
            return this.f11135m;
        }
        synchronized (this) {
            try {
                if (this.f11135m == null) {
                    this.f11135m = new g(this);
                }
                gVar = this.f11135m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
