package J1;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v implements O1.e, O1.d {
    public static final TreeMap j = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f3384a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f3385b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3386c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f3387d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3388e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f3389f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3390g;

    /* renamed from: h, reason: collision with root package name */
    public int f3391h;

    public v(int i3) {
        this.f3384a = i3;
        int i10 = i3 + 1;
        this.f3390g = new int[i10];
        this.f3386c = new long[i10];
        this.f3387d = new double[i10];
        this.f3388e = new String[i10];
        this.f3389f = new byte[i10][];
    }

    public static final v e(int i3, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = j;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (ceilingEntry == null) {
                Unit unit = Unit.INSTANCE;
                v vVar = new v(i3);
                Intrinsics.checkNotNullParameter(query, "query");
                vVar.f3385b = query;
                vVar.f3391h = i3;
                return vVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            v sqliteQuery = (v) ceilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f3385b = query;
            sqliteQuery.f3391h = i3;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // O1.e
    public final void a(O1.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i3 = this.f3391h;
        if (1 > i3) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f3390g[i10];
            if (i11 == 1) {
                statement.x(i10);
            } else if (i11 == 2) {
                statement.m(i10, this.f3386c[i10]);
            } else if (i11 != 3) {
                String string2 = StubApp.getString2(2906);
                if (i11 == 4) {
                    String str = this.f3388e[i10];
                    if (str == null) {
                        throw new IllegalArgumentException(string2);
                    }
                    statement.g(i10, str);
                } else if (i11 == 5) {
                    byte[] bArr = this.f3389f[i10];
                    if (bArr == null) {
                        throw new IllegalArgumentException(string2);
                    }
                    statement.o(i10, bArr);
                }
            } else {
                statement.w(this.f3387d[i10], i10);
            }
            if (i10 == i3) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // O1.e
    public final String d() {
        String str = this.f3385b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(StubApp.getString2(2906));
    }

    @Override // O1.d
    public final void g(int i3, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3390g[i3] = 4;
        this.f3388e[i3] = value;
    }

    public final void h() {
        TreeMap treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3384a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i3 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i3;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // O1.d
    public final void m(int i3, long j3) {
        this.f3390g[i3] = 2;
        this.f3386c[i3] = j3;
    }

    @Override // O1.d
    public final void o(int i3, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3390g[i3] = 5;
        this.f3389f[i3] = value;
    }

    @Override // O1.d
    public final void w(double d8, int i3) {
        this.f3390g[i3] = 3;
        this.f3387d[i3] = d8;
    }

    @Override // O1.d
    public final void x(int i3) {
        this.f3390g[i3] = 1;
    }
}
