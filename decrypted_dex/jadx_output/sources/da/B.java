package da;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13459a;

    /* renamed from: b, reason: collision with root package name */
    public static int[] f13460b;

    /* renamed from: c, reason: collision with root package name */
    public static String[] f13461c;

    static {
        String string2 = StubApp.getString2(16838);
        String string22 = StubApp.getString2(948);
        Object[] objArr = {StubApp.getString2(16840), new String[]{StubApp.getString2(16839)}};
        Object[] objArr2 = {StubApp.getString2(16842), new String[]{StubApp.getString2(16841)}};
        Object[] objArr3 = {StubApp.getString2(16844), new String[]{StubApp.getString2(16843)}};
        Object[] objArr4 = {StubApp.getString2(16846), new String[]{StubApp.getString2(16845)}};
        Object[] objArr5 = {StubApp.getString2(16848), new String[]{StubApp.getString2(16847)}};
        Object[] objArr6 = {StubApp.getString2(16850), new String[]{StubApp.getString2(16849)}};
        Object[] objArr7 = {StubApp.getString2(16852), new String[]{StubApp.getString2(16851)}};
        Object[] objArr8 = {StubApp.getString2(16854), new String[]{StubApp.getString2(16853)}};
        Object[] objArr9 = {StubApp.getString2(16856), new String[]{StubApp.getString2(16855)}};
        Object[] objArr10 = {StubApp.getString2(16858), new String[]{StubApp.getString2(16857)}};
        Object[] objArr11 = {StubApp.getString2(16861), new String[]{StubApp.getString2(16859), StubApp.getString2(16860)}};
        Object[] objArr12 = {StubApp.getString2(16863), new String[]{StubApp.getString2(16862)}};
        Object[] objArr13 = {StubApp.getString2(16865), new String[]{StubApp.getString2(16864)}};
        Object[] objArr14 = {StubApp.getString2(16867), new String[]{StubApp.getString2(16866)}};
        Object[] objArr15 = {StubApp.getString2(16869), new String[]{StubApp.getString2(16868)}};
        Object[] objArr16 = {StubApp.getString2(16871), new String[]{StubApp.getString2(16870)}};
        Object[] objArr17 = {StubApp.getString2(16873), new String[]{StubApp.getString2(16872)}};
        Object[] objArr18 = {StubApp.getString2(16875), new String[]{StubApp.getString2(16874)}};
        Object[] objArr19 = {StubApp.getString2(16877), new String[]{StubApp.getString2(16876)}};
        Object[] objArr20 = {StubApp.getString2(16879), new String[]{StubApp.getString2(16878)}};
        Object[] objArr21 = {StubApp.getString2(16881), new String[]{StubApp.getString2(16880)}};
        Object[] objArr22 = {StubApp.getString2(16883), new String[]{StubApp.getString2(16882)}};
        Object[] objArr23 = {StubApp.getString2(16885), new String[]{StubApp.getString2(16884)}};
        String string23 = StubApp.getString2(8478);
        Object[] objArr24 = {StubApp.getString2(16886), new String[]{string23}};
        Object[] objArr25 = {StubApp.getString2(16888), new String[]{StubApp.getString2(16887)}};
        Object[] objArr26 = {StubApp.getString2(16890), new String[]{StubApp.getString2(16889)}};
        Object[] objArr27 = {StubApp.getString2(16892), new String[]{StubApp.getString2(16891)}};
        Object[] objArr28 = {StubApp.getString2(16894), new String[]{StubApp.getString2(16893)}};
        Object[] objArr29 = {StubApp.getString2(16896), new String[]{StubApp.getString2(16895)}};
        Object[] objArr30 = {StubApp.getString2(16899), new String[]{StubApp.getString2(16897), StubApp.getString2(16898)}};
        Object[] objArr31 = {StubApp.getString2(16901), new String[]{StubApp.getString2(16900)}};
        Object[] objArr32 = {StubApp.getString2(16903), new String[]{StubApp.getString2(16902)}};
        Object[] objArr33 = {StubApp.getString2(16905), new String[]{StubApp.getString2(16904)}};
        Object[] objArr34 = {StubApp.getString2(16907), new String[]{StubApp.getString2(16906)}};
        Object[] objArr35 = {StubApp.getString2(16909), new String[]{StubApp.getString2(16908)}};
        Object[] objArr36 = {StubApp.getString2(16911), new String[]{StubApp.getString2(16910)}};
        Object[] objArr37 = {StubApp.getString2(16913), new String[]{StubApp.getString2(16912)}};
        Object[] objArr38 = {StubApp.getString2(16915), new String[]{StubApp.getString2(16914)}};
        Object[] objArr39 = {StubApp.getString2(16917), new String[]{StubApp.getString2(16916)}};
        Object[] objArr40 = {StubApp.getString2(16920), new String[]{StubApp.getString2(16918), StubApp.getString2(16919)}};
        Object[] objArr41 = {StubApp.getString2(16923), new String[]{StubApp.getString2(16921), StubApp.getString2(16922)}};
        Object[] objArr42 = {StubApp.getString2(16925), new String[]{StubApp.getString2(16924)}};
        Object[] objArr43 = {StubApp.getString2(16927), new String[]{StubApp.getString2(16926)}};
        Object[] objArr44 = {StubApp.getString2(16929), new String[]{StubApp.getString2(16928)}};
        Object[] objArr45 = {StubApp.getString2(16931), new String[]{StubApp.getString2(16930)}};
        Object[] objArr46 = {StubApp.getString2(16933), new String[]{StubApp.getString2(16932)}};
        String string24 = StubApp.getString2(16934);
        Object[] objArr47 = {StubApp.getString2(16935), new String[]{string24}};
        Object[] objArr48 = {StubApp.getString2(16937), new String[]{StubApp.getString2(16936)}};
        String string25 = StubApp.getString2(8477);
        Object[][] objArr49 = {objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, new Object[]{string25, new String[]{string25}}, new Object[]{StubApp.getString2(16939), new String[]{StubApp.getString2(16938)}}, new Object[]{StubApp.getString2(16941), new String[]{StubApp.getString2(16940)}}, new Object[]{StubApp.getString2(16943), new String[]{StubApp.getString2(16942)}}, new Object[]{StubApp.getString2(16945), new String[]{StubApp.getString2(16944)}}, new Object[]{StubApp.getString2(16948), new String[]{StubApp.getString2(16946), StubApp.getString2(16947)}}, new Object[]{StubApp.getString2(16949), new String[]{string24}}, new Object[]{StubApp.getString2(16951), new String[]{StubApp.getString2(16950)}}, new Object[]{StubApp.getString2(16953), new String[]{StubApp.getString2(16952)}}, new Object[]{StubApp.getString2(16955), new String[]{StubApp.getString2(16954)}}, new Object[]{StubApp.getString2(16957), new String[]{StubApp.getString2(16956)}}, new Object[]{StubApp.getString2(16959), new String[]{StubApp.getString2(16958)}}, new Object[]{StubApp.getString2(16961), new String[]{StubApp.getString2(16960)}}, new Object[]{StubApp.getString2(16963), new String[]{StubApp.getString2(16962)}}, new Object[]{StubApp.getString2(16965), new String[]{StubApp.getString2(16964)}}, new Object[]{StubApp.getString2(16967), new String[]{StubApp.getString2(16966)}}, new Object[]{StubApp.getString2(16969), new String[]{StubApp.getString2(16968)}}, new Object[]{StubApp.getString2(16971), new String[]{StubApp.getString2(16970)}}, new Object[]{StubApp.getString2(16973), new String[]{StubApp.getString2(16972)}}, new Object[]{StubApp.getString2(16975), new String[]{StubApp.getString2(16974)}}, new Object[]{StubApp.getString2(16977), new String[]{StubApp.getString2(16976)}}, new Object[]{StubApp.getString2(16979), new String[]{StubApp.getString2(16978)}}, new Object[]{StubApp.getString2(16982), new String[]{StubApp.getString2(16980), StubApp.getString2(16981)}}, new Object[]{StubApp.getString2(16984), new String[]{StubApp.getString2(16983)}}, new Object[]{StubApp.getString2(16986), new String[]{StubApp.getString2(16985)}}, new Object[]{StubApp.getString2(16988), new String[]{StubApp.getString2(16987)}}, new Object[]{StubApp.getString2(16990), new String[]{StubApp.getString2(16989)}}, new Object[]{StubApp.getString2(16992), new String[]{StubApp.getString2(16991)}}, new Object[]{StubApp.getString2(16994), new String[]{StubApp.getString2(16993)}}, new Object[]{StubApp.getString2(16996), new String[]{StubApp.getString2(16995)}}, new Object[]{StubApp.getString2(16998), new String[]{StubApp.getString2(16997)}}, new Object[]{StubApp.getString2(17000), new String[]{StubApp.getString2(16999)}}, new Object[]{StubApp.getString2(17002), new String[]{StubApp.getString2(17001)}}, new Object[]{StubApp.getString2(17004), new String[]{StubApp.getString2(17003)}}, new Object[]{StubApp.getString2(17006), new String[]{StubApp.getString2(17005)}}, new Object[]{StubApp.getString2(17009), new String[]{StubApp.getString2(17007), StubApp.getString2(17008)}}, new Object[]{StubApp.getString2(17011), new String[]{StubApp.getString2(17010)}}, new Object[]{StubApp.getString2(17013), new String[]{StubApp.getString2(17012)}}, new Object[]{StubApp.getString2(17015), new String[]{StubApp.getString2(17014)}}, new Object[]{StubApp.getString2(17017), new String[]{StubApp.getString2(17016)}}, new Object[]{StubApp.getString2(17019), new String[]{StubApp.getString2(17018)}}, new Object[]{StubApp.getString2(17021), new String[]{StubApp.getString2(17020)}}, new Object[]{StubApp.getString2(17023), new String[]{StubApp.getString2(17022)}}, new Object[]{StubApp.getString2(17025), new String[]{StubApp.getString2(17024)}}, new Object[]{StubApp.getString2(17027), new String[]{StubApp.getString2(17026)}}, new Object[]{StubApp.getString2(17029), new String[]{StubApp.getString2(17028)}}, new Object[]{StubApp.getString2(17031), new String[]{StubApp.getString2(17030)}}, new Object[]{StubApp.getString2(17033), new String[]{StubApp.getString2(17032)}}, new Object[]{StubApp.getString2(17035), new String[]{StubApp.getString2(17034)}}, new Object[]{StubApp.getString2(17038), new String[]{StubApp.getString2(17036), StubApp.getString2(17037)}}, new Object[]{StubApp.getString2(17040), new String[]{StubApp.getString2(17039)}}, new Object[]{StubApp.getString2(17042), new String[]{StubApp.getString2(17041)}}, new Object[]{StubApp.getString2(17044), new String[]{StubApp.getString2(17043)}}, new Object[]{StubApp.getString2(17046), new String[]{StubApp.getString2(17045)}}, new Object[]{StubApp.getString2(17048), new String[]{StubApp.getString2(17047)}}, new Object[]{StubApp.getString2(17050), new String[]{StubApp.getString2(17049)}}, new Object[]{StubApp.getString2(17052), new String[]{StubApp.getString2(17051)}}, new Object[]{StubApp.getString2(17054), new String[]{StubApp.getString2(17053)}}, new Object[]{StubApp.getString2(17056), new String[]{StubApp.getString2(17055)}}, new Object[]{StubApp.getString2(17058), new String[]{StubApp.getString2(17057)}}, new Object[]{StubApp.getString2(17060), new String[]{StubApp.getString2(17059)}}, new Object[]{StubApp.getString2(17062), new String[]{StubApp.getString2(17061)}}, new Object[]{StubApp.getString2(17064), new String[]{StubApp.getString2(17063)}}, new Object[]{StubApp.getString2(17066), new String[]{StubApp.getString2(17065)}}, new Object[]{StubApp.getString2(17068), new String[]{StubApp.getString2(17067)}}, new Object[]{StubApp.getString2(17070), new String[]{StubApp.getString2(17069)}}, new Object[]{StubApp.getString2(17072), new String[]{StubApp.getString2(17071)}}, new Object[]{StubApp.getString2(17074), new String[]{StubApp.getString2(17073)}}, new Object[]{StubApp.getString2(17076), new String[]{StubApp.getString2(17075)}}, new Object[]{StubApp.getString2(17078), new String[]{StubApp.getString2(17077)}}, new Object[]{StubApp.getString2(17080), new String[]{StubApp.getString2(17079)}}, new Object[]{StubApp.getString2(17082), new String[]{StubApp.getString2(17081)}}, new Object[]{StubApp.getString2(17084), new String[]{StubApp.getString2(17083)}}, new Object[]{StubApp.getString2(17086), new String[]{StubApp.getString2(17085)}}, new Object[]{StubApp.getString2(17088), new String[]{StubApp.getString2(17087)}}, new Object[]{StubApp.getString2(17090), new String[]{StubApp.getString2(17089)}}, new Object[]{StubApp.getString2(17092), new String[]{StubApp.getString2(17091)}}, new Object[]{StubApp.getString2(17095), new String[]{StubApp.getString2(17093), StubApp.getString2(17094)}}, new Object[]{StubApp.getString2(17097), new String[]{StubApp.getString2(17096)}}, new Object[]{StubApp.getString2(17100), new String[]{StubApp.getString2(17098), StubApp.getString2(17099)}}, new Object[]{StubApp.getString2(17102), new String[]{StubApp.getString2(17101)}}, new Object[]{StubApp.getString2(17104), new String[]{StubApp.getString2(17103)}}, new Object[]{StubApp.getString2(17106), new String[]{StubApp.getString2(17105)}}, new Object[]{StubApp.getString2(17108), new String[]{StubApp.getString2(17107)}}, new Object[]{StubApp.getString2(17110), new String[]{StubApp.getString2(17109)}}, new Object[]{StubApp.getString2(17112), new String[]{StubApp.getString2(17111)}}, new Object[]{StubApp.getString2(2164), new String[]{string23}}, new Object[]{StubApp.getString2(17114), new String[]{StubApp.getString2(17113)}}, new Object[]{StubApp.getString2(17116), new String[]{StubApp.getString2(17115)}}, new Object[]{StubApp.getString2(17118), new String[]{StubApp.getString2(17117)}}};
        f13459a = new HashMap(138);
        for (int i3 = 0; i3 < 138; i3++) {
            Object[] objArr50 = objArr49[i3];
            f13459a.put((String) objArr50[0], (String[]) objArr50[1]);
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    bufferedInputStream = AbstractC0624h2.o() ? new BufferedInputStream(AbstractC0624h2.k("/com/tom_roush/fontbox/resources/unicode/Scripts.txt")) : new BufferedInputStream(B.class.getResourceAsStream("/com/tom_roush/fontbox/resources/unicode/Scripts.txt"));
                    a(bufferedInputStream);
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused) {
                            Log.w(string22, string2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.w(string22, StubApp.getString2("17119") + e10.getMessage());
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            }
        } catch (IOException unused2) {
            Log.w(string22, string2);
        }
    }

    public static void a(BufferedInputStream bufferedInputStream) {
        TreeMap treeMap = new TreeMap(new A.i(4));
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(bufferedInputStream));
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        String str = null;
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, StubApp.getString2(1262));
                if (stringTokenizer.countTokens() >= 2) {
                    String trim = stringTokenizer.nextToken().trim();
                    String trim2 = stringTokenizer.nextToken().trim();
                    int[] iArr2 = new int[2];
                    int indexOf2 = trim.indexOf(StubApp.getString2(15721));
                    if (indexOf2 == -1) {
                        int parseInt = Integer.parseInt(trim, 16);
                        iArr2[1] = parseInt;
                        iArr2[0] = parseInt;
                    } else {
                        iArr2[0] = Integer.parseInt(trim.substring(0, indexOf2), 16);
                        iArr2[1] = Integer.parseInt(trim.substring(indexOf2 + 2), 16);
                    }
                    if (iArr2[0] == iArr[1] + 1 && trim2.equals(str)) {
                        iArr[1] = iArr2[1];
                    } else {
                        treeMap.put(iArr2, trim2);
                        str = trim2;
                        iArr = iArr2;
                    }
                }
            }
        }
        lineNumberReader.close();
        f13460b = new int[treeMap.size()];
        f13461c = new String[treeMap.size()];
        int i3 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            f13460b[i3] = ((int[]) entry.getKey())[0];
            f13461c[i3] = (String) entry.getValue();
            i3++;
        }
    }
}
