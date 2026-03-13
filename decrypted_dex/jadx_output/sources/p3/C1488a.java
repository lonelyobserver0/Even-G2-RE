package p3;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1488a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19675a;

    public C1488a(String str) {
        this.f19675a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f19675a);
    }
}
