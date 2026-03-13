package Ha;

import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.StringWriter;
import java.text.Bidi;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends a {

    /* renamed from: L, reason: collision with root package name */
    public static final float f2967L;

    /* renamed from: M, reason: collision with root package name */
    public static final float f2968M;

    /* renamed from: N, reason: collision with root package name */
    public static final String[] f2969N;

    /* renamed from: O, reason: collision with root package name */
    public static final HashMap f2970O;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f2971A;

    /* renamed from: B, reason: collision with root package name */
    public final float f2972B;

    /* renamed from: C, reason: collision with root package name */
    public final float f2973C;

    /* renamed from: D, reason: collision with root package name */
    public final float f2974D;

    /* renamed from: E, reason: collision with root package name */
    public final float f2975E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f2976F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f2977G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f2978H;

    /* renamed from: I, reason: collision with root package name */
    public StringWriter f2979I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2980J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f2981K;

    /* renamed from: m, reason: collision with root package name */
    public final String f2982m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2983n;

    /* renamed from: o, reason: collision with root package name */
    public final String f2984o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2985p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2986q;

    /* renamed from: r, reason: collision with root package name */
    public final String f2987r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2988s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2989t;

    /* renamed from: u, reason: collision with root package name */
    public int f2990u;

    /* renamed from: v, reason: collision with root package name */
    public int f2991v;

    /* renamed from: w, reason: collision with root package name */
    public int f2992w;

    /* renamed from: x, reason: collision with root package name */
    public int f2993x;

    /* renamed from: y, reason: collision with root package name */
    public int f2994y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2995z;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[Catch: all -> 0x00d7, IOException -> 0x00da, TryCatch #0 {IOException -> 0x00da, blocks: (B:23:0x00c6, B:25:0x00cc, B:26:0x00ec, B:31:0x00dc), top: B:22:0x00c6, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc A[Catch: all -> 0x00d7, IOException -> 0x00da, TryCatch #0 {IOException -> 0x00da, blocks: (B:23:0x00c6, B:25:0x00cc, B:26:0x00ec, B:31:0x00dc), top: B:22:0x00c6, outer: #5 }] */
    static {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ha.e.<clinit>():void");
    }

    public e() {
        String property = System.getProperty(StubApp.getString2(2731));
        this.f2982m = property;
        this.f2983n = StubApp.getString2(397);
        this.f2984o = "";
        this.f2985p = "";
        this.f2986q = "";
        this.f2987r = property;
        this.f2988s = "";
        this.f2989t = "";
        this.f2990u = 0;
        this.f2991v = 1;
        this.f2992w = IntCompanionObject.MAX_VALUE;
        this.f2993x = -1;
        this.f2994y = -1;
        this.f2995z = true;
        this.f2971A = true;
        this.f2972B = f2967L;
        this.f2973C = f2968M;
        this.f2974D = 0.5f;
        this.f2975E = 0.3f;
        this.f2976F = null;
        this.f2977G = new ArrayList();
        this.f2978H = new HashMap();
        this.f2981K = null;
    }

    public static d l(ArrayList arrayList, String str) {
        String n10;
        int length = str.length();
        StringBuilder sb2 = null;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if ((64256 <= charAt && charAt <= 65023) || (65136 <= charAt && charAt <= 65279)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length * 2);
                }
                sb2.append((CharSequence) str, i10, i3);
                if (charAt == 65010 && i3 > 0) {
                    int i11 = i3 - 1;
                    if (str.charAt(i11) == 1575 || str.charAt(i11) == 65165) {
                        sb2.append(StubApp.getString2(2732));
                        i10 = i3 + 1;
                    }
                }
                sb2.append(Normalizer.normalize(str.substring(i3, i3 + 1), Normalizer.Form.NFKC).trim());
                i10 = i3 + 1;
            }
            i3++;
        }
        if (sb2 == null) {
            n10 = n(str);
        } else {
            sb2.append((CharSequence) str, i10, i3);
            n10 = n(sb2.toString());
        }
        d dVar = new d();
        dVar.f2966a = n10;
        return dVar;
    }

    public static String n(String str) {
        Bidi bidi = new Bidi(str, -2);
        if (!bidi.isMixed() && bidi.getBaseLevel() == 0) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i3 = 0; i3 < runCount; i3++) {
            bArr[i3] = (byte) bidi.getRunLevel(i3);
            numArr[i3] = Integer.valueOf(i3);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < runCount; i10++) {
            int intValue = numArr[i10].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        char charAt = str.charAt(runLimit);
                        if (Character.isMirrored(str.codePointAt(runLimit))) {
                            HashMap hashMap = f2970O;
                            if (hashMap.containsKey(Character.valueOf(charAt))) {
                                sb2.append(hashMap.get(Character.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        } else {
                            sb2.append(charAt);
                        }
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    public static LinkedList p(ArrayList arrayList) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = ((b) it.next()).f2960a;
            if (fVar == null) {
                linkedList.add(l(new ArrayList(arrayList2), sb2.toString()));
                sb2 = new StringBuilder();
                arrayList2.clear();
            } else {
                sb2.append(fVar.f3011p);
                arrayList2.add(fVar);
            }
        }
        if (sb2.length() > 0) {
            linkedList.add(l(arrayList2, sb2.toString()));
        }
        return linkedList;
    }

    public static void q(BufferedInputStream bufferedInputStream) {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(bufferedInputStream));
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                return;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, StubApp.getString2(1262));
                int countTokens = stringTokenizer.countTokens();
                Character[] chArr = new Character[countTokens];
                for (int i3 = 0; i3 < countTokens; i3++) {
                    chArr[i3] = Character.valueOf((char) Integer.parseInt(stringTokenizer.nextToken().trim(), 16));
                }
                if (countTokens == 2) {
                    f2970O.put(chArr[0], chArr[1]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x042a, code lost:
    
        if (r12.f2962b == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x044c, code lost:
    
        if (r2 == o(r4)) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m(sa.C1609b r37) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ha.e.m(sa.b):java.lang.String");
    }

    public final Pattern o(c cVar) {
        String str = cVar.f2965e.f3011p;
        if (this.f2981K == null) {
            this.f2981K = new ArrayList();
            for (String str2 : f2969N) {
                this.f2981K.add(Pattern.compile(str2));
            }
        }
        Iterator it = this.f2981K.iterator();
        while (it.hasNext()) {
            Pattern pattern = (Pattern) it.next();
            if (pattern.matcher(str).matches()) {
                return pattern;
            }
        }
        return null;
    }

    public final void r(LinkedList linkedList) {
        int size = linkedList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2979I.write(((d) linkedList.get(i3)).f2966a);
            if (i3 < size - 1) {
                this.f2979I.write(this.f2983n);
            }
        }
    }

    public final void s() {
        if (!this.f2980J) {
            t();
        }
        this.f2979I.write(this.f2985p);
        this.f2980J = false;
    }

    public final void t() {
        if (this.f2980J) {
            s();
            this.f2980J = false;
        }
        this.f2979I.write(this.f2984o);
        this.f2980J = true;
    }
}
