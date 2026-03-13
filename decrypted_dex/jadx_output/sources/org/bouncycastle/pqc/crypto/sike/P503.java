package org.bouncycastle.pqc.crypto.sike;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class P503 extends Internal {
    public P503(boolean z2) {
        this.COMPRESS = z2;
        this.CRYPTO_SECRETKEYBYTES = 434;
        this.CRYPTO_PUBLICKEYBYTES = 378;
        this.CRYPTO_BYTES = 24;
        this.CRYPTO_CIPHERTEXTBYTES = 402;
        if (z2) {
            this.CRYPTO_SECRETKEYBYTES = 407;
            this.CRYPTO_PUBLICKEYBYTES = 225;
            this.CRYPTO_CIPHERTEXTBYTES = 280;
        }
        this.NWORDS_FIELD = 8;
        this.PRIME_ZERO_WORDS = 3;
        this.NBITS_FIELD = 503;
        this.MAXBITS_FIELD = 512;
        this.MAXWORDS_FIELD = AbstractC1482f.v(512, 64, 1, 64);
        this.NWORDS64_FIELD = (503 + 63) / 64;
        this.NBITS_ORDER = 256;
        this.NWORDS_ORDER = AbstractC1482f.v(256, 64, 1, 64);
        this.NWORDS64_ORDER = (256 + 63) / 64;
        this.MAXBITS_ORDER = 256;
        this.ALICE = 0;
        this.BOB = 1;
        this.OALICE_BITS = 250;
        this.OBOB_BITS = 253;
        this.OBOB_EXPON = 159;
        this.MASK_ALICE = 3;
        this.MASK_BOB = 15;
        this.PARAM_A = 6;
        this.PARAM_C = 1;
        this.MAX_INT_POINTS_ALICE = 7;
        this.MAX_INT_POINTS_BOB = 8;
        this.MAX_Alice = 125;
        this.MAX_Bob = 159;
        this.MSG_BYTES = 24;
        int i3 = (250 + 7) / 8;
        this.SECRETKEY_A_BYTES = i3;
        int i10 = ((253 - 1) + 7) / 8;
        this.SECRETKEY_B_BYTES = i10;
        int i11 = ((503 + 7) / 8) * 2;
        this.FP2_ENCODED_BYTES = i11;
        this.PRIME = new long[]{-1, -1, -1, -6052837899185946625L, 1371447078966912928L, 1989455001339985327L, 6937169319750509776L, 18127602061483550L};
        this.PRIMEx2 = new long[]{-2, -1, -1, 6341068275337658367L, 2742894157933825857L, 3978910002679970654L, -4572405434208532064L, 36255204122967100L};
        this.PRIMEx4 = new long[]{-4, -1, -1, -5764607523034234881L, 5485788315867651714L, 7957820005359941308L, -9144810868417064128L, 72510408245934201L};
        this.PRIMEp1 = new long[]{0, 0, 0, -6052837899185946624L, 1371447078966912928L, 1989455001339985327L, 6937169319750509776L, 18127602061483550L};
        this.PRIMEp1x64 = new long[]{-4461107314665330645L, -1802088430207800380L, 1256978695003386886L, 1160166531934947224L};
        this.PRIMEx16p = new long[]{16, 0, 0, Long.MIN_VALUE, -6992818379522110486L, -8322327821750875619L, -628489347501693444L, 3527199594194418739L, 1469206208402633719L, -2321267407214619740L, 3713841762384630283L, 5732158007287747578L, -2430897911214499685L, -4830033863159816259L, 5867348778409282426L, 285023702989702L};
        this.Alice_order = new long[]{0, 0, 0, 288230376151711744L};
        this.Bob_order = new long[]{-4461107314665330645L, -1802088430207800380L, 1256978695003386886L, 1160166531934947224L};
        this.A_gen = new long[]{6703660896400103571L, -5909411912860498377L, 3678485159306027873L, -1093120675051731550L, 2873992082182551772L, 7171536194148839865L, -8265119447870746812L, 16352189888232255L, 9094247284453741849L, -3193704231875796372L, -4566050114418754087L, -54528743463601070L, -3047936482764286209L, 1922054504381246808L, -1396317688998530438L, 7612225463883843L, 5585423759613901741L, 2458739554285137871L, 8711841994324700402L, 7897112202292909028L, 5786141083180541608L, -1166217168022687708L, -3785477569279922225L, 4594121609494003L, 969679319129173575L, -2352131510239393043L, -5157801319708392578L, -8562986439770759325L, -6951028502467660703L, -9067673585621255480L, -1528728095638149651L, 1716330900454016L, 2133917679667870743L, 6131595433662066731L, 4132892201466249495L, 4243264721812232392L, 6868906156409292872L, -520717866781942678L, -2868022759630592540L, 12061138545445877L, -4294522333240218021L, 8869864843183837084L, -8701368168747863904L, -4965310479604401471L, -6825489128068601256L, -8596507567827754495L, 3990273888349394775L, 1829864135412729L};
        this.B_gen = new long[]{-2350017237560825637L, -4392041795693706226L, 4385548945328509436L, -771423915569509155L, 4241169154243281967L, -9055620440120322608L, 7121043649763917783L, 8110065236168021L, 0, 0, 0, 0, 0, 0, 0, 0, 3329382374260773473L, 3539711558809017592L, 6589269349358072822L, 3923158083819410753L, -5273354194737115313L, 1859160943325703733L, -794327878939895329L, 15124960556656395L, 0, 0, 0, 0, 0, 0, 0, 0, 3317107392457288018L, -3242006345699259022L, 2378317285299659333L, 2752067541212454492L, 5401008318620329606L, -3485230783958939245L, -925585022753670519L, 3869545957505286L, 279293490929988356L, -7404656326429938090L, -9205024153151674593L, 1152299110578731394L, -1908147126641080015L, 1402013848611896279L, 564564276466162271L, 16163713578947404L};
        this.Montgomery_R2 = new long[]{5947461595517747487L, -7239495231421361479L, -6650860256814894726L, 6612826553991653612L, -7038675916694928349L, -4645012440608975211L, 5109635575176285622L, 17852757024708465L};
        this.Montgomery_one = new long[]{1017, 0, 0, -5476377146882523136L, 7190870292575474356L, 5866111745285600125L, -8444962029219724990L, 10972777180780883L};
        this.strat_Alice = new int[]{61, 32, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 29, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 13, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 5, 4, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1};
        this.strat_Bob = new int[]{71, 38, 21, 13, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 5, 4, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1, 17, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 33, 17, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1};
        if (z2) {
            this.MASK2_BOB = 3;
            this.MASK3_BOB = 255;
            this.ORDER_A_ENCODED_BYTES = i3;
            this.ORDER_B_ENCODED_BYTES = i10;
            this.PARTIALLY_COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 4, i11, 2);
            this.COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 3, i11, 2);
            this.UNCOMPRESSEDPK_BYTES = 378;
            this.TABLE_R_LEN = 17;
            this.TABLE_V_LEN = 34;
            this.TABLE_V3_LEN = 20;
            this.W_2 = 5;
            this.W_3 = 3;
            this.ELL2_W = 1 << 5;
            this.ELL3_W = 27;
            this.ELL2_EMODW = 1 << (250 % 5);
            this.ELL3_EMODW = 1;
            this.DLEN_2 = AbstractC1482f.v(250, 5, 1, 5);
            this.DLEN_3 = AbstractC1482f.v(159, 3, 1, 3);
            this.PLEN_2 = 51;
            this.PLEN_3 = 54;
            InputStream resourceAsStream = P503.class.getResourceAsStream(StubApp.getString2(34165));
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
                this.ph3_T = Internal.ReadFromProperty(properties, StubApp.getString2(34168), this.DLEN_3 * (this.ELL3_W >> 1) * 2 * this.NWORDS64_FIELD);
                int i12 = this.NWORDS64_FIELD;
                this.Montgomery_R = new long[i12];
                int i13 = this.DLEN_3;
                int i14 = this.ELL3_W;
                this.ph3_T1 = new long[(i14 >>> 1) * i13 * 2 * i12];
                this.ph3_T2 = new long[i13 * (i14 >>> 1) * 2 * i12];
                int i15 = this.DLEN_2;
                int i16 = this.ELL2_W;
                int[] iArr = this.ph2_path;
                int i17 = this.PLEN_2;
                this.ph2_T1 = new long[((iArr[i17 - 1] - 1) + ((i16 / 2) * (i15 - 1))) * 2];
                this.ph2_T2 = new long[((iArr[i17 - 1] - 1) + ((i16 / 2) * (i15 - 1))) * 2];
            } catch (IOException e10) {
                throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34091))), e10);
            }
        }
    }
}
