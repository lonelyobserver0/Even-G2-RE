package oa;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18409b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f18410a;

    public h(InputStream inputStream, List list) {
        super(inputStream);
        this.f18410a = list;
    }
}
