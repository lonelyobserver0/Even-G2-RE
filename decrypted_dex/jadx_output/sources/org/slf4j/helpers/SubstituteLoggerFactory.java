package org.slf4j.helpers;

import Tc.b;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19584a = false;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19585b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f19586c = new LinkedBlockingQueue();

    @Override // org.slf4j.ILoggerFactory
    public final synchronized a a(String str) {
        b bVar;
        bVar = (b) this.f19585b.get(str);
        if (bVar == null) {
            bVar = new b(str, this.f19586c, this.f19584a);
            this.f19585b.put(str, bVar);
        }
        return bVar;
    }
}
