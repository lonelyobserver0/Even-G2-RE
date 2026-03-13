package com.google.firebase.concurrent;

import D5.C0048l;
import R4.i;
import U9.h;
import V4.a;
import V4.c;
import V4.d;
import W4.b;
import W4.m;
import W4.q;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f12044a = new m(new C0048l(3));

    /* renamed from: b, reason: collision with root package name */
    public static final m f12045b = new m(new C0048l(4));

    /* renamed from: c, reason: collision with root package name */
    public static final m f12046c = new m(new C0048l(5));

    /* renamed from: d, reason: collision with root package name */
    public static final m f12047d = new m(new C0048l(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string2;
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        int length = qVarArr.length;
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(6407);
            if (i3 >= length) {
                break;
            }
            Y3.a.g(qVarArr[i3], string2);
            i3++;
        }
        Collections.addAll(hashSet, qVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i(9), hashSet3);
        q qVar2 = new q(V4.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(V4.b.class, ExecutorService.class), new q(V4.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar2);
        for (q qVar3 : qVarArr2) {
            Y3.a.g(qVar3, string2);
        }
        Collections.addAll(hashSet4, qVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new i(10), hashSet6);
        q qVar4 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar4);
        for (q qVar5 : qVarArr3) {
            Y3.a.g(qVar5, string2);
        }
        Collections.addAll(hashSet7, qVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i(11), hashSet9);
        h a3 = b.a(new q(d.class, Executor.class));
        a3.f7525f = new i(12);
        return Arrays.asList(bVar, bVar2, bVar3, a3.e());
    }
}
