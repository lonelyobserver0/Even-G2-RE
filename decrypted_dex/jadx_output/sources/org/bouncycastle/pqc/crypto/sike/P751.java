package org.bouncycastle.pqc.crypto.sike;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class P751 extends Internal {
    public P751(boolean z2) {
        this.COMPRESS = z2;
        this.CRYPTO_SECRETKEYBYTES = 644;
        this.CRYPTO_PUBLICKEYBYTES = 564;
        this.CRYPTO_BYTES = 32;
        this.CRYPTO_CIPHERTEXTBYTES = 596;
        if (z2) {
            this.CRYPTO_SECRETKEYBYTES = 602;
            this.CRYPTO_PUBLICKEYBYTES = 335;
            this.CRYPTO_CIPHERTEXTBYTES = 410;
        }
        this.NWORDS_FIELD = 12;
        this.PRIME_ZERO_WORDS = 5;
        this.NBITS_FIELD = 751;
        this.MAXBITS_FIELD = 768;
        this.MAXWORDS_FIELD = AbstractC1482f.v(768, 64, 1, 64);
        this.NWORDS64_FIELD = (751 + 63) / 64;
        this.NBITS_ORDER = KyberEngine.KyberPolyBytes;
        this.NWORDS_ORDER = AbstractC1482f.v(KyberEngine.KyberPolyBytes, 64, 1, 64);
        this.NWORDS64_ORDER = (KyberEngine.KyberPolyBytes + 63) / 64;
        this.MAXBITS_ORDER = KyberEngine.KyberPolyBytes;
        this.ALICE = 0;
        this.BOB = 1;
        this.OALICE_BITS = 372;
        this.OBOB_BITS = 379;
        this.OBOB_EXPON = 239;
        this.MASK_ALICE = 15;
        this.MASK_BOB = 3;
        this.PARAM_A = 6;
        this.PARAM_C = 1;
        this.MAX_INT_POINTS_ALICE = 8;
        this.MAX_INT_POINTS_BOB = 10;
        this.MAX_Alice = 186;
        this.MAX_Bob = 239;
        this.MSG_BYTES = 32;
        int i3 = (372 + 7) / 8;
        this.SECRETKEY_A_BYTES = i3;
        int i10 = ((379 - 1) + 7) / 8;
        this.SECRETKEY_B_BYTES = i10;
        int i11 = ((751 + 7) / 8) * 2;
        this.FP2_ENCODED_BYTES = i11;
        this.PRIME = new long[]{-1, -1, -1, -1, -1, -1247497096781627393L, -2023076633380357976L, -2696078265604912010L, 598583372241692790L, -8835300488607803576L, 1014031881231588454L, 123032916064028L};
        this.PRIMEx2 = new long[]{-2, -1, -1, -1, -1, -2494994193563254785L, -4046153266760715951L, -5392156531209824019L, 1197166744483385581L, 776143096493944464L, 2028063762463176909L, 246065832128056L};
        this.PRIMEx4 = new long[]{-4, -1, -1, -1, -1, -4989988387126509569L, -8092306533521431901L, 7662431011289903579L, 2394333488966771163L, 1552286192987888928L, 4056127524926353818L, 492131664256112L};
        this.PRIMEp1 = new long[]{0, 0, 0, 0, 0, -1247497096781627392L, -2023076633380357976L, -2696078265604912010L, 598583372241692790L, -8835300488607803576L, 1014031881231588454L, 123032916064028L};
        this.PRIMEx16p = new long[]{16, 0, 0, 0, 0, 3026418949592973312L, -9048524026666751262L, -5959215869190573789L, -707923838024617692L, 6028454529806440190L, 4444467948008272687L, 6389925372342901886L, 9183714343363691506L, 5885816994991374139L, -2935474327975582859L, 6605506351970878676L, -6619916175660507992L, 2354645367770068943L, 4229001520684072827L, 8116152847571104894L, 5904732737952813393L, -5904894579777863975L, -2354210980765550922L, 13129340006L};
        this.Alice_order = new long[]{0, 0, 0, 0, 0, 4503599627370496L};
        this.Bob_order = new long[]{-3933801230357590293L, 6463124234301828670L, -1619469101396693591L, 3121071280576823428L, 2957168939937196118L, 503942824198258913L};
        this.A_gen = new long[]{-8624597008524461400L, -5020841716012422112L, -4508180761239314355L, 586935199814300635L, 1231476659462315650L, -3246394521084132208L, 7720484030924475341L, -7852071398881600364L, -2188584000029134321L, -8546628160115759780L, 2594594101592586405L, 16460334914570L, -5857059702320032876L, -6114084965349520524L, -1936358513353380623L, -8715966234124349157L, -543319585398042881L, 5769280992065803964L, 5532188670625076987L, -1866799854436416823L, -7172910929776876023L, -3954764222233415354L, 9207655709386969385L, 36625983307955L, 1122465274781142185L, 8515870630345178839L, -1924743458572280985L, -7735178800194673427L, -3132739788306177595L, 4840703288083784924L, -4856739261585915672L, -5564526081832302557L, -1255673010972750885L, 8865126078528016748L, 3693150086021936691L, 36658777259884L, -1369314893638426804L, -288665025702785293L, 1672925350903708369L, -4583776393718080526L, 2382796300166624212L, -4469495515226427753L, 2278800419424555458L, 118108782222142818L, 1476285485934066847L, -2412546410971581458L, 2038060998052304781L, 107394058694173L, 1585483835096717809L, -6514868516257168393L, 7781638337591394101L, 6664888135375272208L, 2840823194606539793L, -5651061943462976096L, 2611282525231902794L, 6070226513535983789L, -3628334550803276311L, -3194324477546548331L, 7824800416788242299L, 58455551134839L, -7243670977810514200L, -2651806496363392450L, 2745271787383434087L, -6805338174168646425L, -7576149946420897235L, -7341551600998515230L, -3718998877823341149L, 1375411507907286301L, -4268452966569410958L, 5435466916003927824L, 8796316040578972826L, 31328095521215L};
        this.B_gen = new long[]{-8833499854113736564L, 8392675302948378161L, 9147551389475264226L, -7765403244197863993L, 1891166766906289442L, 8726784965380087145L, 278069042628663236L, 321051512772386179L, 4418794039415165171L, 811238939992429693L, -6570909703790141913L, 56397746590099L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8179464935493790912L, -2991263922968465696L, -154199308264604616L, 601370936378187550L, -2974587491997514357L, 5596913087184264637L, 5895422123728360424L, -1899885251769383899L, -8034677416696319560L, 5132030994927125788L, 3098590566816827475L, 44009130331453L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5376076391536300772L, 278885298517689489L, -2325809399318866862L, -6210198366434735997L, -8835293157288827764L, 2637748658071451261L, 3544807444712948572L, -2233125461162933279L, -1534070816221365583L, -5251650682390400545L, -560613151583404810L, 59505860712722L, 6397758586429206260L, -9108104224853317045L, 4403427314326644353L, -7834048129543563472L, -7297181264924982569L, -1979301445290863950L, 15521226430153318L, 3328537178486072741L, -546546720349608969L, -8077959945485607684L, -415175987874826629L, 115645459333053L};
        this.Montgomery_R2 = new long[]{2535603850726686808L, -2665847985508301526L, 6788776303855402382L, -861315488127195386L, 5274503137951975249L, 2266259624764636289L, -6751092101015630312L, -5373858421559392315L, 4908312795585420432L, 6229583484603254826L, 488927695601805643L, 72213483953973L};
        this.Montgomery_one = new long[]{149933, 0, 0, 0, 0, -9002695655113621504L, 6136068611055053926L, 7599709743867700432L, -3990831716756599250L, 5522737203492907350L, 1222606818372667369L, 49869481633250L};
        this.strat_Alice = new int[]{80, 48, 27, 15, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 12, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 21, 12, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1, 33, 20, 12, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 8, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1};
        this.strat_Bob = new int[]{112, 63, 32, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 31, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 15, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 49, 31, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 15, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 21, 12, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1};
        if (z2) {
            this.MASK2_BOB = 0;
            this.MASK3_BOB = 255;
            this.ORDER_A_ENCODED_BYTES = i3;
            this.ORDER_B_ENCODED_BYTES = i10;
            this.PARTIALLY_COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 4, i11, 2);
            this.COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 3, i11, 2);
            this.UNCOMPRESSEDPK_BYTES = 564;
            this.TABLE_R_LEN = 17;
            this.TABLE_V_LEN = 34;
            this.TABLE_V3_LEN = 20;
            this.W_2 = 4;
            this.W_3 = 3;
            this.ELL2_W = 1 << 4;
            this.ELL3_W = 27;
            this.ELL2_EMODW = 1 << (372 % 4);
            this.ELL3_EMODW = 9;
            this.DLEN_2 = AbstractC1482f.v(372, 4, 1, 4);
            this.DLEN_3 = AbstractC1482f.v(239, 3, 1, 3);
            this.PLEN_2 = 94;
            this.PLEN_3 = 81;
            InputStream resourceAsStream = P751.class.getResourceAsStream(StubApp.getString2(34170));
            Properties properties = new Properties();
            try {
                properties.load(resourceAsStream);
                this.ph2_path = Internal.ReadIntsFromProperty(properties, "ph2_path", this.PLEN_2);
                this.ph3_path = Internal.ReadIntsFromProperty(properties, StubApp.getString2(34137), this.PLEN_3);
                this.A_gen = Internal.ReadFromProperty(properties, StubApp.getString2(34138), this.NWORDS64_FIELD * 6);
                this.B_gen = Internal.ReadFromProperty(properties, StubApp.getString2(34139), this.NWORDS64_FIELD * 6);
                this.XQB3 = Internal.ReadFromProperty(properties, StubApp.getString2(34140), this.NWORDS64_FIELD * 2);
                this.A_basis_zero = Internal.ReadFromProperty(properties, StubApp.getString2(34141), this.NWORDS64_FIELD * 8);
                this.B_basis_zero = Internal.ReadFromProperty(properties, StubApp.getString2(34142), this.NWORDS64_FIELD * 8);
                this.B_gen_3_tors = Internal.ReadFromProperty(properties, StubApp.getString2(34143), this.NWORDS64_FIELD * 16);
                this.g_R_S_im = Internal.ReadFromProperty(properties, StubApp.getString2(34144), this.NWORDS64_FIELD);
                this.Montgomery_R2 = Internal.ReadFromProperty(properties, StubApp.getString2(34166), this.NWORDS64_FIELD);
                this.Montgomery_RB1 = Internal.ReadFromProperty(properties, StubApp.getString2(34147), this.NWORDS64_FIELD);
                this.Montgomery_RB2 = Internal.ReadFromProperty(properties, StubApp.getString2(34148), this.NWORDS64_FIELD);
                this.Montgomery_one = Internal.ReadFromProperty(properties, StubApp.getString2(34167), this.NWORDS64_FIELD);
                this.threeinv = Internal.ReadFromProperty(properties, StubApp.getString2(34149), this.NWORDS64_FIELD);
                this.u_entang = Internal.ReadFromProperty(properties, StubApp.getString2(34150), this.NWORDS64_FIELD * 2);
                this.u0_entang = Internal.ReadFromProperty(properties, StubApp.getString2(34151), this.NWORDS64_FIELD * 2);
                this.table_r_qr = Internal.ReadFromProperty(properties, StubApp.getString2(34152), this.TABLE_R_LEN, this.NWORDS64_FIELD);
                this.table_r_qnr = Internal.ReadFromProperty(properties, StubApp.getString2(34153), this.TABLE_R_LEN, this.NWORDS64_FIELD);
                this.table_v_qr = Internal.ReadFromProperty(properties, StubApp.getString2(34154), this.TABLE_V_LEN, this.NWORDS64_FIELD);
                this.table_v_qnr = Internal.ReadFromProperty(properties, StubApp.getString2(34155), this.TABLE_V_LEN, this.NWORDS64_FIELD);
                this.v_3_torsion = Internal.ReadFromProperty(properties, StubApp.getString2(34156), this.TABLE_V3_LEN, 2, this.NWORDS64_FIELD);
                this.T_tate3 = Internal.ReadFromProperty(properties, StubApp.getString2(34157), a.f(this.OBOB_EXPON, 1, 6, 4) * this.NWORDS64_FIELD);
                this.T_tate2_firststep_P = Internal.ReadFromProperty(properties, StubApp.getString2(34158), this.NWORDS64_FIELD * 4);
                this.T_tate2_P = Internal.ReadFromProperty(properties, StubApp.getString2(34159), (this.OALICE_BITS - 2) * 3 * this.NWORDS64_FIELD);
                this.T_tate2_firststep_Q = Internal.ReadFromProperty(properties, StubApp.getString2(34160), this.NWORDS64_FIELD * 4);
                this.T_tate2_Q = Internal.ReadFromProperty(properties, StubApp.getString2(34161), (this.OALICE_BITS - 2) * 3 * this.NWORDS64_FIELD);
                this.ph2_T = Internal.ReadFromProperty(properties, StubApp.getString2(34162), this.DLEN_2 * (this.ELL2_W >>> 1) * 2 * this.NWORDS64_FIELD);
                this.ph3_T1 = Internal.ReadFromProperty(properties, StubApp.getString2(34163), this.DLEN_3 * (this.ELL3_W >> 1) * 2 * this.NWORDS64_FIELD);
                this.ph3_T2 = Internal.ReadFromProperty(properties, StubApp.getString2(34164), this.DLEN_3 * (this.ELL3_W >> 1) * 2 * this.NWORDS64_FIELD);
                int i12 = this.NWORDS64_FIELD;
                this.Montgomery_R = new long[i12];
                int i13 = this.DLEN_2;
                int i14 = this.ELL2_W;
                int[] iArr = this.ph2_path;
                int i15 = this.PLEN_2;
                this.ph2_T1 = new long[((iArr[i15 - 1] - 1) + ((i14 / 2) * (i13 - 1))) * 2];
                this.ph2_T2 = new long[((iArr[i15 - 1] - 1) + ((i14 / 2) * (i13 - 1))) * 2];
                this.ph3_T = new long[this.DLEN_3 * (this.ELL3_W >> 1) * 2 * i12];
            } catch (IOException e10) {
                throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34091))), e10);
            }
        }
    }
}
