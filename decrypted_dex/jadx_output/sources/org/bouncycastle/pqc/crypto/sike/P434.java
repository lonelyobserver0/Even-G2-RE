package org.bouncycastle.pqc.crypto.sike;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class P434 extends Internal {
    public P434(boolean z2) {
        this.COMPRESS = z2;
        this.CRYPTO_SECRETKEYBYTES = 374;
        this.CRYPTO_PUBLICKEYBYTES = 330;
        this.CRYPTO_BYTES = 16;
        this.CRYPTO_CIPHERTEXTBYTES = 346;
        if (z2) {
            this.CRYPTO_SECRETKEYBYTES = 350;
            this.CRYPTO_PUBLICKEYBYTES = 197;
            this.CRYPTO_CIPHERTEXTBYTES = 236;
        }
        this.NWORDS_FIELD = 7;
        this.PRIME_ZERO_WORDS = 3;
        this.NBITS_FIELD = 434;
        this.MAXBITS_FIELD = 448;
        this.MAXWORDS_FIELD = AbstractC1482f.v(448, 64, 1, 64);
        this.NWORDS64_FIELD = (434 + 63) / 64;
        this.NBITS_ORDER = 256;
        this.NWORDS_ORDER = AbstractC1482f.v(256, 64, 1, 64);
        this.NWORDS64_ORDER = (256 + 63) / 64;
        this.MAXBITS_ORDER = 256;
        this.ALICE = 0;
        this.BOB = 1;
        this.OALICE_BITS = 216;
        this.OBOB_BITS = 218;
        this.OBOB_EXPON = 137;
        this.MASK_ALICE = 255;
        this.MASK_BOB = 1;
        this.PARAM_A = 6;
        this.PARAM_C = 1;
        this.MAX_INT_POINTS_ALICE = 7;
        this.MAX_INT_POINTS_BOB = 8;
        this.MAX_Alice = 108;
        this.MAX_Bob = 137;
        this.MSG_BYTES = 16;
        int i3 = (216 + 7) / 8;
        this.SECRETKEY_A_BYTES = i3;
        int i10 = ((218 - 1) + 7) / 8;
        this.SECRETKEY_B_BYTES = i10;
        int i11 = ((434 + 7) / 8) * 2;
        this.FP2_ENCODED_BYTES = i11;
        this.PRIME = new long[]{-1, -1, -1, -161717841442111489L, 8918917783347572387L, 7853257225132122198L, 620258357900100L};
        this.PRIMEx2 = new long[]{-2, -1, -1, -323435682884222977L, -608908507014406841L, -2740229623445307220L, 1240516715800200L};
        this.PRIMEx4 = new long[]{-4, -1, -1, -646871365768445953L, -1217817014028813681L, -5480459246890614439L, 2481033431600401L};
        this.PRIMEp1 = new long[]{0, 0, 0, -161717841442111488L, 8918917783347572387L, 7853257225132122198L, 620258357900100L};
        this.PRIMEx16p = new long[]{16, 0, 0, 5174970926147567616L, -8704207961479042176L, 6950185827705812272L, 6073522028379477874L, -4224597189565045742L, 8299186480726035350L, 7225369840861796773L, 2456441653404885428L, -5891485665658122495L, 1781491355331495958L, 333691781277L};
        this.Alice_order = new long[]{0, 0, 0, 16777216};
        this.Bob_order = new long[]{6390225231553133283L, -4242295759374092239L, 1689769520075363969L, 36970279};
        this.A_gen = new long[]{409251790387889599L, -7956914563081327573L, -5772233213491609001L, 8135632727773423537L, -605746078158370611L, 2414452085739184671L, 11115521240260L, 8395851790856910728L, 2986355008512957707L, -3794508369610992171L, -8297630390065234006L, -6344405898491969121L, -2994353266636644724L, 281073067659850L, -88129956366309573L, -3267881773463506490L, -507342119971546937L, -2145611229349799165L, 1973682341831588061L, 8312799048378913301L, 497853136119926L, -5930968907585159722L, 7710088909771808848L, 7498146198864584751L, 2174778336782639988L, -2099344739079935595L, -6420807801124297464L, 438485524985150L, 124497379906645117L, 3220114552465917457L, 2709773247140401691L, 6980995868580086445L, 4225536559282510125L, 4701685901084574963L, 609687130428995L, -5139244406301072054L, -1180825250703942163L, 6350294504100107936L, 8618087912213766372L, 308885086986017528L, -2653863745610111006L, 202858940514502L};
        this.B_gen = new long[]{7950145635403778211L, 3053921039650069509L, -1472232571310339971L, 6369396808518798415L, -5151006957371847381L, 2507423554624419257L, 491294718579999L, 0, 0, 0, 0, 0, 0, 0, -368551928616227954L, 5280595860558773788L, -1217497873284611460L, 5300724274592529762L, -5761561158429016438L, -850473803693194369L, 57208989669550L, 0, 0, 0, 0, 0, 0, 0, 2898969037767559396L, -7923814947979270585L, 9073321008578907802L, 7539793830764276893L, -9117835332022963109L, 148738643701593348L, 139132528504375L, -5514455700498887503L, 7856701733796155952L, -1449781872342195351L, 3113577795642755667L, 4926779461749210259L, -4685648887271738037L, 408994988652499L};
        this.Montgomery_R2 = new long[]{2946862024238734128L, -5986282916474808126L, -6113751670094468979L, 1683438818023996427L, -6067031773192244098L, 7629496211932212634L, 41406098690346L};
        this.Montgomery_one = new long[]{29740, 0, 0, -5111598749797318656L, -2881840887160132396L, -1643158192681172724L, 260509760564954L};
        this.strat_Alice = new int[]{48, 28, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 13, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 5, 4, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 21, 12, 7, 4, 2, 1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1};
        this.strat_Bob = new int[]{66, 33, 17, 9, 5, 3, 2, 1, 1, 1, 1, 2, 1, 1, 1, 4, 2, 1, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 32, 16, 8, 4, 3, 1, 1, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 16, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1, 8, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 2, 1, 1};
        if (z2) {
            this.MASK2_BOB = 0;
            this.MASK3_BOB = CertificateBody.profileType;
            this.ORDER_A_ENCODED_BYTES = i3;
            this.ORDER_B_ENCODED_BYTES = i10;
            this.PARTIALLY_COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 4, i11, 2);
            this.COMPRESSED_CHUNK_CT = AbstractC1482f.c(i3, 3, i11, 2);
            this.UNCOMPRESSEDPK_BYTES = 330;
            this.TABLE_R_LEN = 17;
            this.TABLE_V_LEN = 34;
            this.TABLE_V3_LEN = 20;
            this.W_2 = 4;
            this.W_3 = 3;
            this.ELL2_W = 1 << 4;
            this.ELL3_W = 27;
            this.ELL2_EMODW = 1 << (216 % 4);
            this.ELL3_EMODW = 9;
            this.DLEN_2 = AbstractC1482f.v(216, 4, 1, 4);
            this.DLEN_3 = AbstractC1482f.v(137, 3, 1, 3);
            this.PLEN_2 = 55;
            this.PLEN_3 = 47;
            InputStream resourceAsStream = P434.class.getResourceAsStream(StubApp.getString2(34136));
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
                this.g_phiR_phiS_re = Internal.ReadFromProperty(properties, StubApp.getString2(34145), this.NWORDS64_FIELD);
                this.g_phiR_phiS_im = Internal.ReadFromProperty(properties, StubApp.getString2(34146), this.NWORDS64_FIELD);
                this.Montgomery_RB1 = Internal.ReadFromProperty(properties, StubApp.getString2(34147), this.NWORDS64_FIELD);
                this.Montgomery_RB2 = Internal.ReadFromProperty(properties, StubApp.getString2(34148), this.NWORDS64_FIELD);
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
                this.ph3_T1 = Internal.ReadFromProperty(properties, StubApp.getString2(34163), this.DLEN_3 * (this.ELL3_W >>> 1) * 2 * this.NWORDS64_FIELD);
                this.ph3_T2 = Internal.ReadFromProperty(properties, StubApp.getString2(34164), this.DLEN_3 * (this.ELL3_W >>> 1) * 2 * this.NWORDS64_FIELD);
                int i12 = this.DLEN_2;
                int i13 = this.ELL2_W;
                int[] iArr = this.ph2_path;
                int i14 = this.PLEN_2;
                this.ph2_T1 = new long[((iArr[i14 - 1] - 1) + ((i13 / 2) * (i12 - 1))) * 2];
                this.ph2_T2 = new long[((iArr[i14 - 1] - 1) + ((i13 / 2) * (i12 - 1))) * 2];
                this.ph3_T = new long[((this.ph3_path[this.PLEN_3 - 1] - 1) + ((this.ELL3_W / 2) * (this.DLEN_3 - 1))) * 2];
            } catch (IOException e10) {
                throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34091))), e10);
            }
        }
    }
}
