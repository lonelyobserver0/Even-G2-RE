package x9;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import r0.AbstractC1560u;
import t0.C1710j;
import y8.InterfaceC1977b;

/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1924c implements P0.q, InterfaceC1977b {
    @Override // P0.q
    public Object d(Uri uri, C1710j c1710j) {
        return Long.valueOf(AbstractC1560u.M(new BufferedReader(new InputStreamReader(c1710j)).readLine()));
    }
}
