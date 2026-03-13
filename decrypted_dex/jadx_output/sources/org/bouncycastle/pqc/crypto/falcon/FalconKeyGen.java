package org.bouncycastle.pqc.crypto.falcon;

import i2.u;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconKeyGen {
    private short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, 209};
    final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    final int[] bitlength_avg = {4, 11, 24, 50, 102, 202, 401, 794, 1577, 3138, 6308};
    final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};
    final int DEPTH_INT_FG = 4;
    FPREngine fpr = new FPREngine();
    FalconSmallPrimeList primes = new FalconSmallPrimeList();
    FalconFFT fft = new FalconFFT();
    FalconCodec codec = new FalconCodec();
    FalconVrfy vrfy = new FalconVrfy();

    private static int mkn(int i3) {
        return 1 << i3;
    }

    private long toUnsignedLong(int i3) {
        return i3 & BodyPartID.bodyIdMax;
    }

    public long get_rng_u64(SHAKE256 shake256) {
        shake256.inner_shake256_extract(new byte[8], 0, 8);
        return ((r1[7] & 255) << 56) | (r1[0] & 255) | ((r1[1] & 255) << 8) | ((r1[2] & 255) << 16) | ((r1[3] & 255) << 24) | ((r1[4] & 255) << 32) | ((r1[5] & 255) << 40) | ((r1[6] & 255) << 48);
    }

    public void keygen(SHAKE256 shake256, byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11, byte[] bArr4, int i12, short[] sArr, int i13, int i14) {
        FalconKeyGen falconKeyGen;
        int i15;
        int i16;
        short[] sArr2;
        int i17;
        int i18;
        byte b2;
        FalconKeyGen falconKeyGen2 = this;
        byte[] bArr5 = bArr;
        int i19 = i3;
        byte[] bArr6 = bArr2;
        int i20 = i10;
        int i21 = i14;
        int mkn = mkn(i21);
        short[] sArr3 = sArr;
        while (true) {
            FalconFPR[] falconFPRArr = new FalconFPR[mkn * 3];
            falconKeyGen2.poly_small_mkgauss(shake256, bArr5, i19, i21);
            falconKeyGen2.poly_small_mkgauss(shake256, bArr6, i20, i21);
            int i22 = 1 << (falconKeyGen2.codec.max_fg_bits[i21] - 1);
            for (int i23 = 0; i23 < mkn; i23++) {
                byte b10 = bArr5[i19 + i23];
                if (b10 >= i22 || b10 <= (i18 = -i22) || (b2 = bArr6[i20 + i23]) >= i22 || b2 <= i18) {
                    i22 = -1;
                    break;
                }
            }
            if (i22 >= 0) {
                int poly_small_sqnorm = falconKeyGen2.poly_small_sqnorm(bArr5, i19, i21);
                int poly_small_sqnorm2 = falconKeyGen2.poly_small_sqnorm(bArr6, i20, i21);
                if ((((-((poly_small_sqnorm | poly_small_sqnorm2) >>> 31)) | (poly_small_sqnorm + poly_small_sqnorm2)) & BodyPartID.bodyIdMax) < 16823) {
                    int i24 = mkn + mkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, 0, bArr5, i19, i21);
                    int i25 = mkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, i25, bArr6, i20, i21);
                    falconKeyGen = falconKeyGen2;
                    falconKeyGen.fft.FFT(falconFPRArr, 0, i21);
                    falconKeyGen.fft.FFT(falconFPRArr, i25, i21);
                    falconKeyGen.fft.poly_invnorm2_fft(falconFPRArr, i24, falconFPRArr, 0, falconFPRArr, i25, i14);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, 0, i14);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, i25, i14);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, 0, falconKeyGen.fpr.fpr_q, i14);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, i25, falconKeyGen.fpr.fpr_q, i14);
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, 0, falconFPRArr, i24, i14);
                    i21 = i14;
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, i25, falconFPRArr, i24, i21);
                    i15 = i25;
                    falconKeyGen.fft.iFFT(falconFPRArr, 0, i21);
                    falconKeyGen.fft.iFFT(falconFPRArr, i15, i21);
                    FalconFPR falconFPR = falconKeyGen.fpr.fpr_zero;
                    for (int i26 = 0; i26 < i15; i26++) {
                        FPREngine fPREngine = falconKeyGen.fpr;
                        FalconFPR fpr_add = fPREngine.fpr_add(falconFPR, fPREngine.fpr_sqr(falconFPRArr[i26]));
                        FPREngine fPREngine2 = falconKeyGen.fpr;
                        falconFPR = fPREngine2.fpr_add(fpr_add, fPREngine2.fpr_sqr(falconFPRArr[i15 + i26]));
                    }
                    FPREngine fPREngine3 = falconKeyGen.fpr;
                    if (fPREngine3.fpr_lt(falconFPR, fPREngine3.fpr_bnorm_max)) {
                        short[] sArr4 = new short[i15 * 2];
                        if (sArr3 == null) {
                            sArr2 = sArr4;
                            i16 = 0;
                            i17 = i15;
                        } else {
                            i16 = i13;
                            sArr2 = sArr3;
                            i17 = 0;
                        }
                        short[] sArr5 = sArr2;
                        if (falconKeyGen.vrfy.compute_public(sArr2, i16, bArr, i3, bArr2, i10, i21, sArr4, i17) != 0) {
                            if (falconKeyGen.solve_NTRU(i21, bArr3, i11, bArr4, i12, bArr, i3, bArr2, i10, (1 << (falconKeyGen.codec.max_FG_bits[i21] - 1)) - 1, new int[i21 > 2 ? i15 * 28 : i15 * 84], 0) != 0) {
                                return;
                            }
                        }
                        falconKeyGen2 = this;
                        bArr5 = bArr;
                        i19 = i3;
                        bArr6 = bArr2;
                        i20 = i10;
                        i21 = i14;
                        mkn = i15;
                        sArr3 = sArr5;
                    } else {
                        bArr5 = bArr;
                        i19 = i3;
                        bArr6 = bArr2;
                        i20 = i10;
                        falconKeyGen2 = falconKeyGen;
                        mkn = i15;
                    }
                }
            }
            falconKeyGen = falconKeyGen2;
            i15 = mkn;
            bArr5 = bArr;
            i19 = i3;
            bArr6 = bArr2;
            i20 = i10;
            falconKeyGen2 = falconKeyGen;
            mkn = i15;
        }
    }

    public void make_fg(int[] iArr, int i3, byte[] bArr, int i10, byte[] bArr2, int i11, int i12, int i13, int i14) {
        int i15;
        int[] iArr2;
        int i16;
        FalconKeyGen falconKeyGen;
        int mkn = mkn(i12);
        int i17 = i3 + mkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i18 = falconSmallPrimeArr[0].f19390p;
        for (int i19 = 0; i19 < mkn; i19++) {
            iArr[i3 + i19] = modp_set(bArr[i10 + i19], i18);
            iArr[i17 + i19] = modp_set(bArr2[i11 + i19], i18);
        }
        if (i13 == 0 && i14 != 0) {
            int i20 = falconSmallPrimeArr[0].f19390p;
            int modp_ninv31 = modp_ninv31(i20);
            int i21 = i17 + mkn;
            modp_mkgm2(iArr, i21, iArr, mkn + i21, i12, falconSmallPrimeArr[0].f19389g, i20, modp_ninv31);
            modp_NTT2(iArr, i3, iArr, i21, i12, i20, modp_ninv31);
            modp_NTT2(iArr, i17, iArr, i21, i12, i20, modp_ninv31);
            return;
        }
        int i22 = 0;
        while (i22 < i13) {
            int i23 = i12 - i22;
            int i24 = i22 != 0 ? 1 : 0;
            int i25 = i22 + 1;
            if (i25 < i13 || i14 != 0) {
                i15 = 1;
                iArr2 = iArr;
                i16 = i3;
                falconKeyGen = this;
            } else {
                i15 = 0;
                falconKeyGen = this;
                iArr2 = iArr;
                i16 = i3;
            }
            falconKeyGen.make_fg_step(iArr2, i16, i23, i22, i24, i15);
            i22 = i25;
        }
    }

    public void make_fg_step(int[] iArr, int i3, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        FalconKeyGen falconKeyGen;
        int i19;
        int i20;
        int i21;
        int i22;
        FalconKeyGen falconKeyGen2;
        int i23;
        int i24;
        FalconKeyGen falconKeyGen3 = this;
        int[] iArr2 = iArr;
        boolean z2 = true;
        int i25 = 1 << i10;
        int i26 = i25 >> 1;
        int[] iArr3 = falconKeyGen3.MAX_BL_SMALL;
        int i27 = iArr3[i11];
        int i28 = iArr3[i11 + 1];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i29 = i26 * i28;
        int i30 = i3 + i29;
        int i31 = i30 + i29;
        int i32 = i25 * i27;
        int i33 = i31 + i32;
        int i34 = i33 + i32;
        int i35 = i34 + i25;
        int i36 = i35 + i25;
        System.arraycopy(iArr2, i3, iArr2, i31, i25 * 2 * i27);
        int i37 = 0;
        while (i37 < i27) {
            int i38 = falconSmallPrimeArr[i37].f19390p;
            int modp_ninv31 = falconKeyGen3.modp_ninv31(i38);
            int modp_R2 = falconKeyGen3.modp_R2(i38, modp_ninv31);
            boolean z10 = z2;
            int i39 = i37;
            int i40 = i31;
            int i41 = i34;
            int i42 = i35;
            falconKeyGen3.modp_mkgm2(iArr2, i41, iArr, i42, i10, falconSmallPrimeArr[i37].f19389g, i38, modp_ninv31);
            int i43 = i40 + i39;
            int i44 = 0;
            int i45 = i43;
            while (i44 < i25) {
                iArr[i36 + i44] = iArr[i45];
                i44++;
                i45 += i27;
            }
            if (i12 == 0) {
                int i46 = i36;
                falconKeyGen = this;
                falconKeyGen.modp_NTT2(iArr, i46, iArr, i41, i10, i38, modp_ninv31);
                i17 = i46;
                i16 = i42;
                i18 = modp_ninv31;
                i38 = i38;
            } else {
                i16 = i42;
                i17 = i36;
                i18 = modp_ninv31;
                falconKeyGen = this;
            }
            int i47 = i3 + i39;
            int i48 = 0;
            int i49 = i47;
            while (i48 < i26) {
                int i50 = i17 + (i48 << 1);
                iArr[i49] = falconKeyGen.modp_montymul(falconKeyGen.modp_montymul(iArr[i50], iArr[i50 + 1], i38, i18), modp_R2, i38, i18);
                i48++;
                i49 += i28;
            }
            if (i12 != 0) {
                int i51 = i27;
                falconKeyGen.modp_iNTT2_ext(iArr, i43, i51, iArr, i16, i10, i38, i18);
                i19 = i18;
                i20 = i51;
            } else {
                i19 = i18;
                i20 = i27;
            }
            int i52 = i16;
            int i53 = i33 + i39;
            int i54 = 0;
            int i55 = i53;
            while (i54 < i25) {
                iArr[i17 + i54] = iArr[i55];
                i54++;
                i55 += i20;
            }
            if (i12 == 0) {
                int i56 = i38;
                int i57 = i19;
                falconKeyGen2 = this;
                falconKeyGen2.modp_NTT2(iArr, i17, iArr, i41, i10, i56, i57);
                i21 = i20;
                i22 = i57;
                i38 = i56;
            } else {
                i21 = i20;
                i22 = i19;
                falconKeyGen2 = this;
            }
            int i58 = i30 + i39;
            int i59 = 0;
            int i60 = i58;
            while (i59 < i26) {
                int i61 = i17 + (i59 << 1);
                iArr[i60] = falconKeyGen2.modp_montymul(falconKeyGen2.modp_montymul(iArr[i61], iArr[i61 + 1], i38, i22), modp_R2, i38, i22);
                i59++;
                i60 += i28;
            }
            if (i12 != 0) {
                i23 = i52;
                falconKeyGen2.modp_iNTT2_ext(iArr, i53, i21, iArr, i23, i10, i38, i22);
            } else {
                i23 = i52;
            }
            int i62 = i21;
            if (i13 == 0) {
                int i63 = i10 - 1;
                int i64 = i28;
                modp_iNTT2_ext(iArr, i47, i64, iArr, i23, i63, i38, i22);
                modp_iNTT2_ext(iArr, i58, i64, iArr, i23, i63, i38, i22);
                i24 = i64;
            } else {
                i24 = i28;
            }
            i37 = i39 + 1;
            falconKeyGen3 = this;
            iArr2 = iArr;
            i31 = i40;
            i35 = i23;
            i34 = i41;
            z2 = z10;
            i36 = i17;
            i28 = i24;
            i27 = i62;
        }
        int i65 = i27;
        int i66 = i28;
        int i67 = i36;
        int i68 = i31;
        int i69 = i34;
        int i70 = i35;
        FalconKeyGen falconKeyGen4 = this;
        falconKeyGen4.zint_rebuild_CRT(iArr, i31, i65, i65, i25, falconSmallPrimeArr, 1, iArr, i69);
        falconKeyGen4.zint_rebuild_CRT(iArr, i33, i65, i65, i25, falconSmallPrimeArr, 1, iArr, i69);
        int i71 = i69;
        int i72 = i65;
        while (i72 < i66) {
            int i73 = falconSmallPrimeArr[i72].f19390p;
            int modp_ninv312 = falconKeyGen4.modp_ninv31(i73);
            int modp_R22 = falconKeyGen4.modp_R2(i73, modp_ninv312);
            int modp_Rx = falconKeyGen4.modp_Rx(i65, i73, modp_ninv312, modp_R22);
            int i74 = modp_R22;
            int i75 = i71;
            int i76 = i70;
            int i77 = i72;
            falconKeyGen4.modp_mkgm2(iArr, i75, iArr, i76, i10, falconSmallPrimeArr[i72].f19389g, i73, modp_ninv312);
            int i78 = i68;
            int i79 = 0;
            while (i79 < i25) {
                int i80 = i73;
                int i81 = i65;
                int i82 = modp_Rx;
                int i83 = i74;
                int zint_mod_small_signed = zint_mod_small_signed(iArr, i78, i81, i80, modp_ninv312, i83, i82);
                i73 = i80;
                iArr[i67 + i79] = zint_mod_small_signed;
                i79++;
                i78 += i81;
                i65 = i81;
                modp_Rx = i82;
                i74 = i83;
            }
            int i84 = modp_Rx;
            int i85 = i74;
            int i86 = i65;
            FalconKeyGen falconKeyGen5 = this;
            int i87 = i85;
            int i88 = i73;
            falconKeyGen5.modp_NTT2(iArr, i67, iArr, i75, i10, i88, modp_ninv312);
            int i89 = i88;
            int i90 = i3 + i77;
            int i91 = i90;
            int i92 = 0;
            while (i92 < i26) {
                int i93 = i67 + (i92 << 1);
                iArr[i91] = falconKeyGen5.modp_montymul(falconKeyGen5.modp_montymul(iArr[i93], iArr[i93 + 1], i89, modp_ninv312), i87, i89, modp_ninv312);
                i92++;
                i91 += i66;
            }
            int i94 = i33;
            int i95 = 0;
            while (i95 < i25) {
                int i96 = i89;
                int i97 = i87;
                int i98 = i86;
                int i99 = i84;
                int zint_mod_small_signed2 = falconKeyGen5.zint_mod_small_signed(iArr, i94, i98, i96, modp_ninv312, i97, i99);
                i89 = i96;
                iArr[i67 + i95] = zint_mod_small_signed2;
                i95++;
                i94 += i98;
                i87 = i97;
                i86 = i98;
                i84 = i99;
                falconKeyGen5 = this;
            }
            int i100 = i86;
            int i101 = i89;
            modp_NTT2(iArr, i67, iArr, i75, i10, i101, modp_ninv312);
            int i102 = i30 + i77;
            int i103 = 0;
            int i104 = i102;
            while (i103 < i26) {
                int i105 = i67 + (i103 << 1);
                iArr[i104] = modp_montymul(modp_montymul(iArr[i105], iArr[i105 + 1], i101, modp_ninv312), i87, i101, modp_ninv312);
                i103++;
                i104 += i66;
            }
            if (i13 == 0) {
                int i106 = i10 - 1;
                i14 = i66;
                i15 = i76;
                modp_iNTT2_ext(iArr, i90, i14, iArr, i15, i106, i101, modp_ninv312);
                modp_iNTT2_ext(iArr, i102, i14, iArr, i15, i106, i101, modp_ninv312);
            } else {
                i14 = i66;
                i15 = i76;
            }
            i72 = i77 + 1;
            falconKeyGen4 = this;
            i66 = i14;
            i70 = i15;
            i71 = i75;
            i65 = i100;
        }
    }

    public int mkgauss(SHAKE256 shake256, int i3) {
        int i10 = 1 << (10 - i3);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j = get_rng_u64(shake256);
            int i13 = (int) (j >>> 63);
            int i14 = (int) (((j & LongCompanionObject.MAX_VALUE) - this.gauss_1024_12289[0]) >>> 63);
            long j3 = LongCompanionObject.MAX_VALUE & get_rng_u64(shake256);
            int i15 = 1;
            int i16 = 0;
            while (true) {
                long[] jArr = this.gauss_1024_12289;
                if (i15 < jArr.length) {
                    int i17 = ((int) ((j3 - jArr[i15]) >>> 63)) ^ 1;
                    i16 |= (-((i14 ^ 1) & i17)) & i15;
                    i14 |= i17;
                    i15++;
                }
            }
            i11 += ((-i13) ^ i16) + i13;
        }
        return i11;
    }

    public void modp_NTT2(int[] iArr, int i3, int[] iArr2, int i10, int i11, int i12, int i13) {
        modp_NTT2_ext(iArr, i3, 1, iArr2, i10, i11, i12, i13);
    }

    public void modp_NTT2_ext(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12, int i13, int i14) {
        if (i12 == 0) {
            return;
        }
        int mkn = mkn(i12);
        int i15 = 1;
        int i16 = mkn;
        while (i15 < mkn) {
            int i17 = i16 >> 1;
            int i18 = 0;
            int i19 = 0;
            while (i18 < i15) {
                int i20 = iArr2[i11 + i15 + i18];
                int i21 = (i19 * i10) + i3;
                int i22 = (i17 * i10) + i21;
                int i23 = 0;
                while (i23 < i17) {
                    int i24 = iArr[i21];
                    int modp_montymul = modp_montymul(iArr[i22], i20, i13, i14);
                    iArr[i21] = modp_add(i24, modp_montymul, i13);
                    iArr[i22] = modp_sub(i24, modp_montymul, i13);
                    i23++;
                    i21 += i10;
                    i22 += i10;
                }
                i18++;
                i19 += i16;
            }
            i15 <<= 1;
            i16 = i17;
        }
    }

    public int modp_R(int i3) {
        return Integer.MIN_VALUE - i3;
    }

    public int modp_R2(int i3, int i10) {
        int modp_R = modp_R(i3);
        int modp_add = modp_add(modp_R, modp_R, i3);
        int modp_montymul = modp_montymul(modp_add, modp_add, i3, i10);
        int modp_montymul2 = modp_montymul(modp_montymul, modp_montymul, i3, i10);
        int modp_montymul3 = modp_montymul(modp_montymul2, modp_montymul2, i3, i10);
        int modp_montymul4 = modp_montymul(modp_montymul3, modp_montymul3, i3, i10);
        int modp_montymul5 = modp_montymul(modp_montymul4, modp_montymul4, i3, i10);
        return (modp_montymul5 + (i3 & (-(modp_montymul5 & 1)))) >>> 1;
    }

    public int modp_Rx(int i3, int i10, int i11, int i12) {
        int i13 = i3 - 1;
        int modp_R = modp_R(i10);
        int i14 = 0;
        while (true) {
            int i15 = 1 << i14;
            if (i15 > i13) {
                return modp_R;
            }
            if ((i15 & i13) != 0) {
                modp_R = modp_montymul(modp_R, i12, i10, i11);
            }
            i12 = modp_montymul(i12, i12, i10, i11);
            i14++;
        }
    }

    public int modp_add(int i3, int i10, int i11) {
        int i12 = (i3 + i10) - i11;
        return i12 + ((-(i12 >>> 31)) & i11);
    }

    public int modp_div(int i3, int i10, int i11, int i12, int i13) {
        int i14 = i11 - 2;
        for (int i15 = 30; i15 >= 0; i15--) {
            int modp_montymul = modp_montymul(i13, i13, i11, i12);
            i13 = modp_montymul ^ ((-(1 & (i14 >>> i15))) & (modp_montymul(modp_montymul, i10, i11, i12) ^ modp_montymul));
        }
        return modp_montymul(i3, modp_montymul(i13, 1, i11, i12), i11, i12);
    }

    public void modp_iNTT2(int[] iArr, int i3, int[] iArr2, int i10, int i11, int i12, int i13) {
        modp_iNTT2_ext(iArr, i3, 1, iArr2, i10, i11, i12, i13);
    }

    public void modp_iNTT2_ext(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 == 0) {
            return;
        }
        int mkn = mkn(i12);
        int i16 = 1;
        int i17 = mkn;
        int i18 = 1;
        while (true) {
            i15 = 0;
            if (i17 <= i16) {
                break;
            }
            i17 >>= 1;
            int i19 = i18 << 1;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i17) {
                int i22 = iArr2[i11 + i17 + i20];
                int i23 = (i21 * i10) + i3;
                int i24 = (i18 * i10) + i23;
                int i25 = 0;
                while (i25 < i18) {
                    int i26 = iArr[i23];
                    int i27 = i16;
                    int i28 = iArr[i24];
                    iArr[i23] = modp_add(i26, i28, i13);
                    iArr[i24] = modp_montymul(modp_sub(i26, i28, i13), i22, i13, i14);
                    i25++;
                    i23 += i10;
                    i24 += i10;
                    i16 = i27;
                }
                i20++;
                i21 += i19;
            }
            i18 = i19;
        }
        int i29 = i16 << (31 - i12);
        int i30 = i3;
        while (i15 < mkn) {
            iArr[i30] = modp_montymul(iArr[i30], i29, i13, i14);
            i15++;
            i30 += i10;
        }
    }

    public void modp_mkgm2(int[] iArr, int i3, int[] iArr2, int i10, int i11, int i12, int i13, int i14) {
        int mkn = mkn(i11);
        int modp_R2 = modp_R2(i13, i14);
        int modp_montymul = modp_montymul(i12, modp_R2, i13, i14);
        for (int i15 = i11; i15 < 10; i15++) {
            modp_montymul = modp_montymul(modp_montymul, modp_montymul, i13, i14);
        }
        int modp_div = modp_div(modp_R2, modp_montymul, i13, i14, modp_R(i13));
        int i16 = 10 - i11;
        int modp_R = modp_R(i13);
        int i17 = modp_R;
        for (int i18 = 0; i18 < mkn; i18++) {
            short s10 = this.REV10[i18 << i16];
            iArr[i3 + s10] = modp_R;
            iArr2[i10 + s10] = i17;
            modp_R = modp_montymul(modp_R, modp_montymul, i13, i14);
            i17 = modp_montymul(i17, modp_div, i13, i14);
        }
    }

    public int modp_montymul(int i3, int i10, int i11, int i12) {
        long unsignedLong = toUnsignedLong(i3) * toUnsignedLong(i10);
        int unsignedLong2 = ((int) (((((i12 * unsignedLong) & toUnsignedLong(IntCompanionObject.MAX_VALUE)) * i11) + unsignedLong) >>> 31)) - i11;
        return unsignedLong2 + ((-(unsignedLong2 >>> 31)) & i11);
    }

    public int modp_ninv31(int i3) {
        int i10 = 2 - i3;
        int i11 = (2 - (i3 * i10)) * i10;
        int i12 = (2 - (i3 * i11)) * i11;
        int i13 = (2 - (i3 * i12)) * i12;
        return (-((2 - (i3 * i13)) * i13)) & IntCompanionObject.MAX_VALUE;
    }

    public int modp_norm(int i3, int i10) {
        return i3 - (i10 & (((i3 - ((i10 + 1) >>> 1)) >>> 31) - 1));
    }

    public void modp_poly_rec_res(int[] iArr, int i3, int i10, int i11, int i12, int i13) {
        int i14 = 1 << (i10 - 1);
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = (i15 << 1) + i3;
            iArr[i3 + i15] = modp_montymul(modp_montymul(iArr[i16], iArr[i16 + 1], i11, i12), i13, i11, i12);
        }
    }

    public int modp_set(int i3, int i10) {
        return i3 + (i10 & (-(i3 >>> 31)));
    }

    public int modp_sub(int i3, int i10, int i11) {
        int i12 = i3 - i10;
        return i12 + ((-(i12 >>> 31)) & i11);
    }

    public void poly_big_to_fp(FalconFPR[] falconFPRArr, int i3, int[] iArr, int i10, int i11, int i12, int i13) {
        int mkn = mkn(i13);
        if (i11 == 0) {
            for (int i14 = 0; i14 < mkn; i14++) {
                falconFPRArr[i3 + i14] = this.fpr.fpr_zero;
            }
            return;
        }
        int i15 = i10;
        int i16 = 0;
        while (i16 < mkn) {
            int i17 = -(iArr[(i15 + i11) - 1] >>> 30);
            int i18 = i17 >>> 1;
            int i19 = i17 & 1;
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPR = fPREngine.fpr_zero;
            FalconFPR falconFPR2 = fPREngine.fpr_one;
            int i20 = 0;
            while (i20 < i11) {
                int i21 = (iArr[i15 + i20] ^ i18) + i19;
                i19 = i21 >>> 31;
                int i22 = i21 & IntCompanionObject.MAX_VALUE;
                FPREngine fPREngine2 = this.fpr;
                falconFPR = fPREngine2.fpr_add(falconFPR, fPREngine2.fpr_mul(fPREngine2.fpr_of(i22 - ((i22 << 1) & i17)), falconFPR2));
                i20++;
                FPREngine fPREngine3 = this.fpr;
                falconFPR2 = fPREngine3.fpr_mul(falconFPR2, fPREngine3.fpr_ptwo31);
            }
            falconFPRArr[i3 + i16] = falconFPR;
            i16++;
            i15 += i12;
        }
    }

    public int poly_big_to_small(byte[] bArr, int i3, int[] iArr, int i10, int i11, int i12) {
        int mkn = mkn(i12);
        for (int i13 = 0; i13 < mkn; i13++) {
            int zint_one_to_plain = zint_one_to_plain(iArr, i10 + i13);
            if (zint_one_to_plain < (-i11) || zint_one_to_plain > i11) {
                return 0;
            }
            bArr[i3 + i13] = (byte) zint_one_to_plain;
        }
        return 1;
    }

    public void poly_small_mkgauss(SHAKE256 shake256, byte[] bArr, int i3, int i10) {
        int mkgauss;
        int mkn = mkn(i10);
        int i11 = 0;
        for (int i12 = 0; i12 < mkn; i12++) {
            while (true) {
                mkgauss = mkgauss(shake256, i10);
                if (mkgauss >= -127 && mkgauss <= 127) {
                    if (i12 != mkn - 1) {
                        i11 ^= mkgauss & 1;
                        break;
                    } else if (((mkgauss & 1) ^ i11) == 0) {
                    }
                }
            }
            bArr[i3 + i12] = (byte) mkgauss;
        }
    }

    public int poly_small_sqnorm(byte[] bArr, int i3, int i10) {
        int mkn = mkn(i10);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < mkn; i13++) {
            byte b2 = bArr[i3 + i13];
            i11 += b2 * b2;
            i12 |= i11;
        }
        return (-(i12 >>> 31)) | i11;
    }

    public void poly_small_to_fp(FalconFPR[] falconFPRArr, int i3, byte[] bArr, int i10, int i11) {
        int mkn = mkn(i11);
        for (int i12 = 0; i12 < mkn; i12++) {
            falconFPRArr[i3 + i12] = this.fpr.fpr_of(bArr[i10 + i12]);
        }
    }

    public void poly_sub_scaled(int[] iArr, int i3, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int[] iArr3, int i15, int i16, int i17, int i18) {
        int mkn = mkn(i18);
        for (int i19 = 0; i19 < mkn; i19++) {
            int i20 = i12;
            int i21 = -iArr3[i15 + i19];
            int i22 = (i19 * i11) + i3;
            for (int i23 = 0; i23 < mkn; i23++) {
                zint_add_scaled_mul_small(iArr, i22, i10, iArr2, i20, i13, i21, i16, i17);
                if (i19 + i23 == mkn - 1) {
                    i22 = i3;
                    i21 = -i21;
                } else {
                    i22 += i11;
                }
                i20 += i14;
            }
        }
    }

    public void poly_sub_scaled_ntt(int[] iArr, int i3, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int[] iArr3, int i15, int i16, int i17, int i18, int[] iArr4, int i19) {
        FalconKeyGen falconKeyGen = this;
        int i20 = i13;
        int mkn = mkn(i18);
        int i21 = i20 + 1;
        int mkn2 = i19 + mkn(i18);
        int mkn3 = mkn2 + mkn(i18);
        int i22 = (mkn * i21) + mkn3;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i23 = 0;
        int i24 = 0;
        while (i24 < i21) {
            int i25 = falconSmallPrimeArr[i24].f19390p;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i25);
            int modp_R2 = falconKeyGen.modp_R2(i25, modp_ninv31);
            int modp_Rx = falconKeyGen.modp_Rx(i20, i25, modp_ninv31, modp_R2);
            int i26 = i24;
            falconKeyGen.modp_mkgm2(iArr4, i19, iArr4, mkn2, i18, falconSmallPrimeArr[i24].f19389g, i25, modp_ninv31);
            int i27 = mkn2;
            for (int i28 = 0; i28 < mkn; i28++) {
                iArr4[i22 + i28] = falconKeyGen.modp_set(iArr3[i15 + i28], i25);
            }
            int i29 = i22;
            falconKeyGen.modp_NTT2(iArr4, i29, iArr4, i19, i18, i25, modp_ninv31);
            int i30 = i25;
            int i31 = mkn3 + i26;
            int i32 = i12;
            int i33 = i31;
            int i34 = 0;
            while (i34 < mkn) {
                int i35 = i30;
                int i36 = modp_ninv31;
                int i37 = modp_Rx;
                int zint_mod_small_signed = zint_mod_small_signed(iArr2, i32, i13, i35, i36, modp_R2, i37);
                i30 = i35;
                iArr4[i33] = zint_mod_small_signed;
                i32 += i14;
                i33 += i21;
                modp_Rx = i37;
                i34++;
                modp_ninv31 = i36;
            }
            int i38 = i21;
            modp_NTT2_ext(iArr4, i31, i38, iArr4, i19, i18, i30, modp_ninv31);
            int i39 = 0;
            while (i39 < mkn) {
                iArr4[i31] = modp_montymul(modp_montymul(iArr4[i29 + i39], iArr4[i31], i30, modp_ninv31), modp_R2, i30, modp_ninv31);
                i39++;
                i31 += i38;
            }
            modp_iNTT2_ext(iArr4, i31, i38, iArr4, i27, i18, i30, modp_ninv31);
            i24 = i26 + 1;
            falconKeyGen = this;
            i21 = i38;
            i22 = i29;
            mkn2 = i27;
            i20 = i13;
        }
        int i40 = i21;
        zint_rebuild_CRT(iArr4, mkn3, i40, i40, mkn, falconSmallPrimeArr, 1, iArr4, i22);
        int i41 = mkn3;
        int i42 = i3;
        while (i23 < mkn) {
            int i43 = i40;
            zint_sub_scaled(iArr, i42, i10, iArr4, i41, i43, i16, i17);
            i40 = i43;
            i23++;
            i42 += i11;
            i41 += i40;
        }
    }

    public int solve_NTRU(int i3, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13, int i14, int[] iArr, int i15) {
        byte[] bArr5;
        int i16;
        FalconKeyGen falconKeyGen;
        int i17;
        byte[] bArr6;
        int i18;
        int i19;
        int[] iArr2;
        int i20;
        int mkn = mkn(i3);
        if (solve_NTRU_deepest(i3, bArr3, i12, bArr4, i13, iArr, i15) == 0) {
            return 0;
        }
        int i21 = i3;
        if (i21 <= 2) {
            int i22 = i21;
            while (true) {
                int i23 = i22 - 1;
                if (i22 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i21, bArr3, i12, bArr4, i13, i23, iArr, i15) == 0) {
                    return 0;
                }
                i21 = i3;
                i22 = i23;
            }
        } else {
            int i24 = i3;
            while (true) {
                int i25 = i24 - 1;
                if (i24 > 2) {
                    if (solve_NTRU_intermediate(i3, bArr3, i12, bArr4, i13, i25, iArr, i15) == 0) {
                        return 0;
                    }
                    i24 = i25;
                } else if (solve_NTRU_binary_depth1(i3, bArr3, i12, bArr4, i13, iArr, i15) == 0 || solve_NTRU_binary_depth0(i3, bArr3, i12, bArr4, i13, iArr, i15) == 0) {
                    return 0;
                }
            }
        }
        if (bArr2 == null) {
            bArr5 = new byte[mkn];
            i16 = 0;
            i17 = i3;
            bArr6 = bArr;
            i18 = i10;
            i19 = i14;
            iArr2 = iArr;
            i20 = i15;
            falconKeyGen = this;
        } else {
            bArr5 = bArr2;
            i16 = i11;
            falconKeyGen = this;
            i17 = i3;
            bArr6 = bArr;
            i18 = i10;
            i19 = i14;
            iArr2 = iArr;
            i20 = i15;
        }
        if (falconKeyGen.poly_big_to_small(bArr6, i18, iArr2, i20, i19, i17) != 0) {
            int i26 = i15 + mkn;
            byte[] bArr7 = bArr5;
            int i27 = i16;
            if (poly_big_to_small(bArr7, i27, iArr, i26, i14, i3) != 0) {
                int i28 = i26 + mkn;
                int i29 = i28 + mkn;
                int i30 = i29 + mkn;
                FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
                int i31 = falconSmallPrimeArr[0].f19390p;
                int modp_ninv31 = modp_ninv31(i31);
                modp_mkgm2(iArr, i30, iArr, i15, i3, falconSmallPrimeArr[0].f19389g, i31, modp_ninv31);
                for (int i32 = 0; i32 < mkn; i32++) {
                    iArr[i15 + i32] = modp_set(bArr7[i27 + i32], i31);
                }
                for (int i33 = 0; i33 < mkn; i33++) {
                    iArr[i26 + i33] = modp_set(bArr3[i12 + i33], i31);
                    iArr[i28 + i33] = modp_set(bArr4[i13 + i33], i31);
                    iArr[i29 + i33] = modp_set(bArr[i10 + i33], i31);
                }
                modp_NTT2(iArr, i26, iArr, i30, i3, i31, modp_ninv31);
                modp_NTT2(iArr, i28, iArr, i30, i3, i31, modp_ninv31);
                modp_NTT2(iArr, i29, iArr, i30, i3, i31, modp_ninv31);
                modp_NTT2(iArr, i15, iArr, i30, i3, i31, modp_ninv31);
                int modp_montymul = modp_montymul(12289, 1, i31, modp_ninv31);
                for (int i34 = 0; i34 < mkn; i34++) {
                    if (modp_sub(modp_montymul(iArr[i26 + i34], iArr[i15 + i34], i31, modp_ninv31), modp_montymul(iArr[i28 + i34], iArr[i29 + i34], i31, modp_ninv31), i31) != modp_montymul) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public int solve_NTRU_binary_depth0(int i3, byte[] bArr, int i10, byte[] bArr2, int i11, int[] iArr, int i12) {
        int i13 = 1;
        int i14 = 1 << i3;
        int i15 = i14 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i16 = 0;
        int i17 = falconSmallPrimeArr[0].f19390p;
        int modp_ninv31 = modp_ninv31(i17);
        int modp_R2 = modp_R2(i17, modp_ninv31);
        int i18 = i12 + i15;
        int i19 = i18 + i15;
        int i20 = i19 + i14;
        int i21 = i20 + i14;
        int i22 = i21 + i14;
        modp_mkgm2(iArr, i21, iArr, i22, i3, falconSmallPrimeArr[0].f19389g, i17, modp_ninv31);
        for (int i23 = 0; i23 < i15; i23++) {
            int i24 = i12 + i23;
            iArr[i24] = modp_set(zint_one_to_plain(iArr, i24), i17);
            int i25 = i18 + i23;
            iArr[i25] = modp_set(zint_one_to_plain(iArr, i25), i17);
        }
        int i26 = i3 - 1;
        modp_NTT2(iArr, i12, iArr, i21, i26, i17, modp_ninv31);
        modp_NTT2(iArr, i18, iArr, i21, i26, i17, modp_ninv31);
        for (int i27 = 0; i27 < i14; i27++) {
            iArr[i19 + i27] = modp_set(bArr[i10 + i27], i17);
            iArr[i20 + i27] = modp_set(bArr2[i11 + i27], i17);
        }
        modp_NTT2(iArr, i19, iArr, i21, i3, i17, modp_ninv31);
        modp_NTT2(iArr, i20, iArr, i21, i3, i17, modp_ninv31);
        int i28 = 0;
        while (i28 < i14) {
            int i29 = i19 + i28;
            int i30 = iArr[i29];
            int i31 = i29 + 1;
            int i32 = iArr[i31];
            int i33 = i20 + i28;
            int i34 = i13;
            int i35 = iArr[i33];
            int i36 = i33 + 1;
            int i37 = i16;
            int i38 = iArr[i36];
            int i39 = i28 >> 1;
            int i40 = i28;
            int modp_montymul = modp_montymul(iArr[i12 + i39], modp_R2, i17, modp_ninv31);
            int modp_montymul2 = modp_montymul(iArr[i18 + i39], modp_R2, i17, modp_ninv31);
            iArr[i29] = modp_montymul(i38, modp_montymul, i17, modp_ninv31);
            iArr[i31] = modp_montymul(i35, modp_montymul, i17, modp_ninv31);
            iArr[i33] = modp_montymul(i32, modp_montymul2, i17, modp_ninv31);
            iArr[i36] = modp_montymul(i30, modp_montymul2, i17, modp_ninv31);
            i28 = i40 + 2;
            i13 = i34;
            i16 = i37;
        }
        int i41 = i13;
        int i42 = i16;
        modp_iNTT2(iArr, i19, iArr, i22, i3, i17, modp_ninv31);
        modp_iNTT2(iArr, i20, iArr, i22, i3, i17, modp_ninv31);
        int i43 = i12 + i14;
        int i44 = i43 + i14;
        System.arraycopy(iArr, i19, iArr, i12, i14 * 2);
        int i45 = i44 + i14;
        int i46 = i45 + i14;
        int i47 = i46 + i14;
        int i48 = i47 + i14;
        modp_mkgm2(iArr, i44, iArr, i45, i3, FalconSmallPrimeList.PRIMES[i42].f19389g, i17, modp_ninv31);
        modp_NTT2(iArr, i12, iArr, i44, i3, i17, modp_ninv31);
        modp_NTT2(iArr, i43, iArr, i44, i3, i17, modp_ninv31);
        int modp_set = modp_set(bArr[i10], i17);
        iArr[i48] = modp_set;
        iArr[i47] = modp_set;
        for (int i49 = i41; i49 < i14; i49++) {
            int i50 = i10 + i49;
            iArr[i47 + i49] = modp_set(bArr[i50], i17);
            iArr[(i48 + i14) - i49] = modp_set(-bArr[i50], i17);
        }
        modp_NTT2(iArr, i47, iArr, i44, i3, i17, modp_ninv31);
        modp_NTT2(iArr, i48, iArr, i44, i3, i17, modp_ninv31);
        for (int i51 = i42; i51 < i14; i51++) {
            int modp_montymul3 = modp_montymul(iArr[i48 + i51], modp_R2, i17, modp_ninv31);
            iArr[i45 + i51] = modp_montymul(modp_montymul3, iArr[i12 + i51], i17, modp_ninv31);
            iArr[i46 + i51] = modp_montymul(modp_montymul3, iArr[i47 + i51], i17, modp_ninv31);
        }
        int modp_set2 = modp_set(bArr2[i11], i17);
        iArr[i48] = modp_set2;
        iArr[i47] = modp_set2;
        for (int i52 = i41; i52 < i14; i52++) {
            int i53 = i11 + i52;
            iArr[i47 + i52] = modp_set(bArr2[i53], i17);
            iArr[(i48 + i14) - i52] = modp_set(-bArr2[i53], i17);
        }
        modp_NTT2(iArr, i47, iArr, i44, i3, i17, modp_ninv31);
        modp_NTT2(iArr, i48, iArr, i44, i3, i17, modp_ninv31);
        for (int i54 = i42; i54 < i14; i54++) {
            int modp_montymul4 = modp_montymul(iArr[i48 + i54], modp_R2, i17, modp_ninv31);
            int i55 = i45 + i54;
            iArr[i55] = modp_add(iArr[i55], modp_montymul(modp_montymul4, iArr[i43 + i54], i17, modp_ninv31), i17);
            int i56 = i46 + i54;
            iArr[i56] = modp_add(iArr[i56], modp_montymul(modp_montymul4, iArr[i47 + i54], i17, modp_ninv31), i17);
        }
        int i57 = modp_ninv31;
        modp_mkgm2(iArr, i44, iArr, i47, i3, FalconSmallPrimeList.PRIMES[i42].f19389g, i17, i57);
        modp_iNTT2(iArr, i45, iArr, i47, i3, i17, i57);
        modp_iNTT2(iArr, i46, iArr, i47, i3, i17, i57);
        for (int i58 = i42; i58 < i14; i58++) {
            int i59 = i45 + i58;
            iArr[i44 + i58] = modp_norm(iArr[i59], i17);
            iArr[i59] = modp_norm(iArr[i46 + i58], i17);
        }
        FalconFPR[] falconFPRArr = new FalconFPR[i14 * 3];
        int i60 = i14 + i14;
        for (int i61 = i42; i61 < i14; i61++) {
            falconFPRArr[i60 + i61] = this.fpr.fpr_of(iArr[i45 + i61]);
        }
        this.fft.FFT(falconFPRArr, i60, i3);
        System.arraycopy(falconFPRArr, i60, falconFPRArr, i14, i15);
        int i62 = i14 + i15;
        int i63 = i42;
        while (i63 < i14) {
            falconFPRArr[i62 + i63] = this.fpr.fpr_of(iArr[i44 + i63]);
            i63++;
            i43 = i43;
            i57 = i57;
        }
        int i64 = i57;
        int i65 = i43;
        this.fft.FFT(falconFPRArr, i62, i3);
        this.fft.poly_div_autoadj_fft(falconFPRArr, i62, falconFPRArr, i14, i3);
        this.fft.iFFT(falconFPRArr, i62, i3);
        for (int i66 = i42; i66 < i14; i66++) {
            iArr[i44 + i66] = modp_set((int) this.fpr.fpr_rint(falconFPRArr[i62 + i66]), i17);
        }
        modp_mkgm2(iArr, i45, iArr, i46, i3, FalconSmallPrimeList.PRIMES[i42].f19389g, i17, i64);
        for (int i67 = i42; i67 < i14; i67++) {
            iArr[i47 + i67] = modp_set(bArr[i10 + i67], i17);
            iArr[i48 + i67] = modp_set(bArr2[i11 + i67], i17);
        }
        modp_NTT2(iArr, i44, iArr, i45, i3, i17, i64);
        modp_NTT2(iArr, i47, iArr, i45, i3, i17, i64);
        modp_NTT2(iArr, i48, iArr, i45, i3, i17, i64);
        for (int i68 = i42; i68 < i14; i68++) {
            int modp_montymul5 = modp_montymul(iArr[i44 + i68], modp_R2, i17, i64);
            int i69 = i12 + i68;
            iArr[i69] = modp_sub(iArr[i69], modp_montymul(modp_montymul5, iArr[i47 + i68], i17, i64), i17);
            int i70 = i65 + i68;
            iArr[i70] = modp_sub(iArr[i70], modp_montymul(modp_montymul5, iArr[i48 + i68], i17, i64), i17);
        }
        modp_iNTT2(iArr, i12, iArr, i46, i3, i17, i64);
        modp_iNTT2(iArr, i65, iArr, i46, i3, i17, i64);
        for (int i71 = i42; i71 < i14; i71++) {
            int i72 = i12 + i71;
            iArr[i72] = modp_norm(iArr[i72], i17);
            int i73 = i65 + i71;
            iArr[i73] = modp_norm(iArr[i73], i17);
        }
        return i41;
    }

    public int solve_NTRU_binary_depth1(int i3, byte[] bArr, int i10, byte[] bArr2, int i11, int[] iArr, int i12) {
        int i13;
        FalconKeyGen falconKeyGen = this;
        int i14 = 1;
        int i15 = 1 << i3;
        int i16 = i3 - 1;
        int i17 = 1 << i16;
        int i18 = i17 >> 1;
        int[] iArr2 = falconKeyGen.MAX_BL_SMALL;
        int i19 = iArr2[1];
        int i20 = iArr2[2];
        int i21 = falconKeyGen.MAX_BL_LARGE[1];
        int i22 = i20 * i18;
        int i23 = i12 + i22;
        int i24 = i23 + i22;
        int i25 = i21 * i17;
        int i26 = i24 + i25;
        int i27 = 0;
        int i28 = 0;
        while (i28 < i21) {
            int i29 = FalconSmallPrimeList.PRIMES[i28].f19390p;
            int i30 = i27;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i29);
            int i31 = i28;
            int modp_R2 = falconKeyGen.modp_R2(i29, modp_ninv31);
            int i32 = i26;
            int modp_Rx = falconKeyGen.modp_Rx(i20, i29, modp_ninv31, modp_R2);
            int i33 = i24 + i31;
            int i34 = i32 + i31;
            int i35 = i25;
            int i36 = i12;
            int i37 = i14;
            int i38 = i23;
            int i39 = i30;
            while (i39 < i18) {
                int i40 = i36;
                iArr[i33] = falconKeyGen.zint_mod_small_signed(iArr, i36, i20, i29, modp_ninv31, modp_R2, modp_Rx);
                falconKeyGen = this;
                int i41 = i38;
                iArr[i34] = falconKeyGen.zint_mod_small_signed(iArr, i41, i20, i29, modp_ninv31, modp_R2, modp_Rx);
                i33 += i21;
                i34 += i21;
                i38 = i41 + i20;
                i36 = i40 + i20;
                i32 = i32;
                i18 = i18;
                i31 = i31;
                i24 = i24;
                i39++;
                i35 = i35;
                i19 = i19;
            }
            i28 = i31 + 1;
            i24 = i24;
            i26 = i32;
            i25 = i35;
            i19 = i19;
            i18 = i18;
            i14 = i37;
            i27 = 0;
        }
        int i42 = i14;
        int i43 = i18;
        int i44 = i19;
        int i45 = i24;
        int i46 = i25;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i45, iArr3, i12, i46);
        int i47 = i12 + i46;
        System.arraycopy(iArr3, i26, iArr3, i47, i46);
        int i48 = i47 + i46;
        int i49 = i44 * i17;
        int i50 = i48 + i49;
        int i51 = i50 + i49;
        int i52 = 0;
        while (i52 < i21) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i53 = falconSmallPrimeArr[i52].f19390p;
            int modp_ninv312 = falconKeyGen.modp_ninv31(i53);
            int modp_R22 = falconKeyGen.modp_R2(i53, modp_ninv312);
            int i54 = i52;
            int i55 = i51;
            int i56 = i55 + i15;
            int i57 = i56 + i17;
            int i58 = i57 + i15;
            int i59 = i21;
            falconKeyGen.modp_mkgm2(iArr3, i55, iArr, i56, i3, falconSmallPrimeArr[i54].f19389g, i53, modp_ninv312);
            int i60 = i53;
            for (int i61 = 0; i61 < i15; i61++) {
                iArr[i57 + i61] = falconKeyGen.modp_set(bArr[i10 + i61], i60);
                iArr[i58 + i61] = falconKeyGen.modp_set(bArr2[i11 + i61], i60);
            }
            falconKeyGen.modp_NTT2(iArr, i57, iArr, i55, i3, i60, modp_ninv312);
            modp_NTT2(iArr, i58, iArr, i55, i3, i60, modp_ninv312);
            int i62 = i55;
            int i63 = i3;
            while (i63 > i16) {
                int i64 = i60;
                int i65 = modp_R22;
                int i66 = i57;
                modp_poly_rec_res(iArr, i66, i63, i64, modp_ninv312, i65);
                modp_poly_rec_res(iArr, i58, i63, i64, modp_ninv312, i65);
                i60 = i64;
                i63--;
                i57 = i66;
                i62 = i62;
                modp_R22 = i65;
            }
            int i67 = modp_R22;
            int i68 = i62;
            int i69 = i68 + i17;
            System.arraycopy(iArr, i56, iArr, i69, i17);
            int i70 = i69 + i17;
            System.arraycopy(iArr, i57, iArr, i70, i17);
            int i71 = i70 + i17;
            System.arraycopy(iArr, i58, iArr, i71, i17);
            int i72 = i71 + i17;
            int i73 = i72 + i43;
            int i74 = i12 + i54;
            int i75 = i47 + i54;
            int i76 = i43;
            int i77 = i47;
            int i78 = i74;
            int i79 = i75;
            int i80 = 0;
            while (i80 < i76) {
                iArr[i72 + i80] = iArr[i78];
                iArr[i73 + i80] = iArr[i79];
                i80++;
                i78 += i59;
                i79 += i59;
            }
            int i81 = i3 - 2;
            modp_NTT2(iArr, i72, iArr, i68, i81, i60, modp_ninv312);
            int i82 = i73;
            modp_NTT2(iArr, i82, iArr, i68, i81, i60, modp_ninv312);
            int i83 = i74;
            int i84 = i75;
            int i85 = 0;
            while (i85 < i76) {
                int i86 = i85 << 1;
                int i87 = i70 + i86;
                int i88 = i83;
                int i89 = iArr[i87];
                int i90 = i82;
                int i91 = iArr[i87 + 1];
                int i92 = i71 + i86;
                int i93 = i84;
                int i94 = iArr[i92];
                int i95 = iArr[i92 + 1];
                int i96 = i85;
                int modp_montymul = modp_montymul(iArr[i72 + i85], i67, i60, modp_ninv312);
                int i97 = i15;
                int modp_montymul2 = modp_montymul(iArr[i90 + i96], i67, i60, modp_ninv312);
                iArr[i88] = modp_montymul(i95, modp_montymul, i60, modp_ninv312);
                iArr[i88 + i59] = modp_montymul(i94, modp_montymul, i60, modp_ninv312);
                iArr[i93] = modp_montymul(i91, modp_montymul2, i60, modp_ninv312);
                iArr[i93 + i59] = modp_montymul(i89, modp_montymul2, i60, modp_ninv312);
                i85 = i96 + 1;
                int i98 = i59 << 1;
                i84 = i93 + i98;
                i83 = i88 + i98;
                i82 = i90;
                i15 = i97;
            }
            int i99 = i15;
            int i100 = i60;
            int i101 = i16;
            modp_iNTT2_ext(iArr, i74, i59, iArr, i69, i101, i100, modp_ninv312);
            modp_iNTT2_ext(iArr, i75, i59, iArr, i69, i101, i100, modp_ninv312);
            int i102 = i44;
            if (i54 < i102) {
                modp_iNTT2(iArr, i70, iArr, i69, i101, i100, modp_ninv312);
                modp_iNTT2(iArr, i71, iArr, i69, i101, i100, modp_ninv312);
                i13 = i101;
                int i103 = i48 + i54;
                int i104 = i50 + i54;
                int i105 = 0;
                while (i105 < i17) {
                    iArr[i103] = iArr[i70 + i105];
                    iArr[i104] = iArr[i71 + i105];
                    i105++;
                    i103 += i102;
                    i104 += i102;
                }
            } else {
                i13 = i101;
            }
            i52 = i54 + 1;
            i43 = i76;
            i47 = i77;
            falconKeyGen = this;
            iArr3 = iArr;
            i44 = i102;
            i51 = i68;
            i21 = i59;
            i16 = i13;
            i15 = i99;
        }
        int i106 = i51;
        int i107 = i21;
        int i108 = i16;
        int i109 = i44;
        int i110 = i17 << 1;
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        zint_rebuild_CRT(iArr, i12, i107, i107, i110, falconSmallPrimeArr2, 1, iArr, i106);
        zint_rebuild_CRT(iArr, i48, i109, i109, i110, falconSmallPrimeArr2, 1, iArr, i106);
        FalconFPR[] falconFPRArr = new FalconFPR[i17];
        FalconFPR[] falconFPRArr2 = new FalconFPR[i17];
        poly_big_to_fp(falconFPRArr, 0, iArr, i12, i107, i107, i108);
        poly_big_to_fp(falconFPRArr2, 0, iArr, i47, i107, i107, i108);
        System.arraycopy(iArr, i48, iArr, i12, i109 * 2 * i17);
        FalconFPR[] falconFPRArr3 = new FalconFPR[i17];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i17];
        poly_big_to_fp(falconFPRArr3, 0, iArr, i12, i109, i109, i108);
        poly_big_to_fp(falconFPRArr4, 0, iArr, i12 + i49, i109, i109, i108);
        this.fft.FFT(falconFPRArr, 0, i108);
        this.fft.FFT(falconFPRArr2, 0, i108);
        this.fft.FFT(falconFPRArr3, 0, i108);
        this.fft.FFT(falconFPRArr4, 0, i108);
        FalconFPR[] falconFPRArr5 = new FalconFPR[i17];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i43];
        this.fft.poly_add_muladj_fft(falconFPRArr5, 0, falconFPRArr, 0, falconFPRArr2, 0, falconFPRArr3, 0, falconFPRArr4, 0, i108);
        this.fft.poly_invnorm2_fft(falconFPRArr6, 0, falconFPRArr3, 0, falconFPRArr4, 0, i108);
        this.fft.poly_mul_autoadj_fft(falconFPRArr5, 0, falconFPRArr6, 0, i108);
        this.fft.iFFT(falconFPRArr5, 0, i108);
        for (int i111 = 0; i111 < i17; i111++) {
            FalconFPR falconFPR = falconFPRArr5[i111];
            FPREngine fPREngine = this.fpr;
            if (!fPREngine.fpr_lt(falconFPR, fPREngine.fpr_ptwo63m1)) {
                return 0;
            }
            FPREngine fPREngine2 = this.fpr;
            if (!fPREngine2.fpr_lt(fPREngine2.fpr_mtwo63m1, falconFPR)) {
                return 0;
            }
            FPREngine fPREngine3 = this.fpr;
            falconFPRArr5[i111] = fPREngine3.fpr_of(fPREngine3.fpr_rint(falconFPR));
        }
        this.fft.FFT(falconFPRArr5, 0, i108);
        this.fft.poly_mul_fft(falconFPRArr3, 0, falconFPRArr5, 0, i108);
        this.fft.poly_mul_fft(falconFPRArr4, 0, falconFPRArr5, 0, i108);
        this.fft.poly_sub(falconFPRArr, 0, falconFPRArr3, 0, i108);
        this.fft.poly_sub(falconFPRArr2, 0, falconFPRArr4, 0, i108);
        this.fft.iFFT(falconFPRArr, 0, i108);
        this.fft.iFFT(falconFPRArr2, 0, i108);
        int i112 = i12 + i17;
        for (int i113 = 0; i113 < i17; i113++) {
            iArr[i12 + i113] = (int) this.fpr.fpr_rint(falconFPRArr[i113]);
            iArr[i112 + i113] = (int) this.fpr.fpr_rint(falconFPRArr2[i113]);
        }
        return i42;
    }

    public int solve_NTRU_deepest(int i3, byte[] bArr, int i10, byte[] bArr2, int i11, int[] iArr, int i12) {
        int i13 = this.MAX_BL_SMALL[i3];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i14 = i12 + i13;
        int i15 = i14 + i13;
        int i16 = i15 + i13;
        int i17 = i16 + i13;
        make_fg(iArr, i15, bArr, i10, bArr2, i11, i3, i3, 0);
        zint_rebuild_CRT(iArr, i15, i13, i13, 2, falconSmallPrimeArr, 0, iArr, i17);
        return (zint_bezout(iArr, i14, iArr, i12, iArr, i15, iArr, i16, i13, iArr, i17) != 0 && zint_mul_small(iArr, i12, i13, 12289) == 0 && zint_mul_small(iArr, i14, i13, 12289) == 0) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0495 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int solve_NTRU_intermediate(int r35, byte[] r36, int r37, byte[] r38, int r39, int r40, int[] r41, int r42) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.falcon.FalconKeyGen.solve_NTRU_intermediate(int, byte[], int, byte[], int, int, int[], int):int");
    }

    public void zint_add_mul_small(int[] iArr, int i3, int[] iArr2, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i3 + i14;
            long unsignedLong = (toUnsignedLong(iArr2[i10 + i14]) * toUnsignedLong(i12)) + toUnsignedLong(iArr[i15]) + toUnsignedLong(i13);
            iArr[i15] = ((int) unsignedLong) & IntCompanionObject.MAX_VALUE;
            i13 = (int) (unsignedLong >>> 31);
        }
        iArr[i3 + i11] = i13;
    }

    public void zint_add_scaled_mul_small(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return;
        }
        int i16 = (-(iArr2[(i11 + i12) - 1] >>> 30)) >>> 1;
        int i17 = 0;
        int i18 = i14;
        int i19 = 0;
        while (i18 < i10) {
            int i20 = i18 - i14;
            int i21 = i20 < i12 ? iArr2[i11 + i20] : i16;
            int i22 = i3 + i18;
            long unsignedLong = (toUnsignedLong(i17 | ((i21 << i15) & IntCompanionObject.MAX_VALUE)) * i13) + toUnsignedLong(iArr[i22]) + i19;
            iArr[i22] = ((int) unsignedLong) & IntCompanionObject.MAX_VALUE;
            i19 = (int) (unsignedLong >>> 31);
            i18++;
            i17 = i21 >>> (31 - i15);
        }
    }

    public int zint_bezout(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11, int[] iArr4, int i12, int i13, int[] iArr5, int i14) {
        FalconKeyGen falconKeyGen = this;
        int i15 = i13;
        int[] iArr6 = iArr5;
        if (i15 == 0) {
            return 0;
        }
        int i16 = i14 + i15;
        int i17 = i16 + i15;
        int i18 = i17 + i15;
        int modp_ninv31 = falconKeyGen.modp_ninv31(iArr3[i11]);
        int modp_ninv312 = falconKeyGen.modp_ninv31(iArr4[i12]);
        System.arraycopy(iArr3, i11, iArr6, i17, i15);
        System.arraycopy(iArr4, i12, iArr6, i18, i15);
        iArr[i3] = 1;
        iArr2[i10] = 0;
        for (int i19 = 1; i19 < i15; i19++) {
            iArr[i3 + i19] = 0;
            iArr2[i10 + i19] = 0;
        }
        System.arraycopy(iArr4, i12, iArr6, i14, i15);
        System.arraycopy(iArr3, i11, iArr6, i16, i15);
        iArr6[i16] = iArr6[i16] - 1;
        int i20 = 30;
        int i21 = (i15 * 62) + 30;
        while (i21 >= i20) {
            int i22 = -1;
            int i23 = i15;
            int i24 = -1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                int i29 = i23 - 1;
                if (i23 <= 0) {
                    break;
                }
                int i30 = iArr6[i17 + i29];
                int i31 = iArr6[i18 + i29];
                i26 ^= (i26 ^ i30) & i24;
                i25 ^= (i25 ^ i30) & i22;
                i28 ^= (i28 ^ i31) & i24;
                i27 ^= (i27 ^ i31) & i22;
                int i32 = ((((i30 | i31) + IntCompanionObject.MAX_VALUE) >>> 31) - 1) & i24;
                int i33 = i24;
                i24 = i32;
                i22 = i33;
                i23 = i29;
            }
            int i34 = ~i22;
            int i35 = i26 & i34;
            long unsignedLong = (falconKeyGen.toUnsignedLong(i35) << 31) + falconKeyGen.toUnsignedLong(i25 | (i26 & i22));
            long unsignedLong2 = (falconKeyGen.toUnsignedLong(i28 & i34) << 31) + falconKeyGen.toUnsignedLong(i27 | (i28 & i22));
            int i36 = iArr6[i17];
            int i37 = iArr6[i18];
            long j = 0;
            int i38 = i17;
            int i39 = 0;
            long j3 = 0;
            long j10 = 1;
            long j11 = 1;
            for (int i40 = 31; i39 < i40; i40 = 31) {
                long j12 = unsignedLong2 - unsignedLong;
                int i41 = i39;
                int i42 = (int) ((j12 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j12))) >>> 63);
                int i43 = (i36 >> i41) & 1;
                int i44 = i43 & (i37 >> i41) & 1;
                int i45 = i44 & i42;
                int i46 = i44 & (~i42);
                int i47 = i45 | (i43 ^ 1);
                int i48 = i36 - ((-i45) & i37);
                long j13 = unsignedLong - ((-falconKeyGen.toUnsignedLong(i45)) & unsignedLong2);
                long j14 = -i45;
                long j15 = j10 - (j3 & j14);
                long j16 = j - (j11 & j14);
                int i49 = i37 - ((-i46) & i48);
                long j17 = unsignedLong2 - (j13 & (-falconKeyGen.toUnsignedLong(i46)));
                long j18 = -i46;
                long j19 = j3 - (j15 & j18);
                long j20 = j11 - (j16 & j18);
                i36 = i48 + ((i47 - 1) & i48);
                long j21 = i47;
                long j22 = j21 - 1;
                j10 = j15 + (j15 & j22);
                j = j16 + (j16 & j22);
                unsignedLong = j13 ^ ((j13 ^ (j13 >> 1)) & (-falconKeyGen.toUnsignedLong(i47)));
                i37 = i49 + ((-i47) & i49);
                long j23 = -j21;
                j3 = j19 + (j19 & j23);
                j11 = j20 + (j20 & j23);
                unsignedLong2 = j17 ^ (((j17 >> 1) ^ j17) & (falconKeyGen.toUnsignedLong(i47) - 1));
                i39 = i41 + 1;
                i16 = i16;
            }
            int i50 = i16;
            int i51 = i18;
            long j24 = j;
            long j25 = j3;
            long j26 = j11;
            int zint_co_reduce = falconKeyGen.zint_co_reduce(iArr5, i38, iArr5, i51, i13, j10, j24, j25, j26);
            long j27 = -(zint_co_reduce & 1);
            long j28 = j10 - ((j10 + j10) & j27);
            long j29 = j24 - ((j24 + j24) & j27);
            long j30 = -(zint_co_reduce >>> 1);
            long j31 = j25 - ((j25 + j25) & j30);
            long j32 = j26 - ((j26 + j26) & j30);
            falconKeyGen = this;
            iArr6 = iArr5;
            int i52 = modp_ninv312;
            i15 = i13;
            falconKeyGen.zint_co_reduce_mod(iArr, i3, iArr6, i14, iArr4, i12, i15, i52, j28, j29, j31, j32);
            int i53 = modp_ninv31;
            falconKeyGen.zint_co_reduce_mod(iArr2, i10, iArr6, i50, iArr3, i11, i15, i53, j28, j29, j31, j32);
            i21 -= 30;
            modp_ninv312 = i52;
            i20 = 30;
            i17 = i38;
            i16 = i50;
            modp_ninv31 = i53;
            i18 = i51;
        }
        int i54 = i17;
        int i55 = iArr5[i54] ^ 1;
        for (int i56 = 1; i56 < i15; i56++) {
            i55 |= iArr5[i54 + i56];
        }
        return (1 - ((i55 | (-i55)) >>> 31)) & iArr3[i11] & iArr4[i12];
    }

    public int zint_co_reduce(int[] iArr, int i3, int[] iArr2, int i10, int i11, long j, long j3, long j10, long j11) {
        long j12 = 0;
        int i12 = 0;
        long j13 = 0;
        while (i12 < i11) {
            int i13 = i3 + i12;
            int i14 = i10 + i12;
            long j14 = iArr[i13];
            long j15 = iArr2[i14];
            long i15 = u.i(j15, j3, j14 * j, j13);
            int i16 = i12;
            long i17 = u.i(j15, j11, j14 * j10, j12);
            if (i16 > 0) {
                iArr[i13 - 1] = ((int) i15) & IntCompanionObject.MAX_VALUE;
                iArr2[i14 - 1] = ((int) i17) & IntCompanionObject.MAX_VALUE;
            }
            j12 = i17 >> 31;
            i12 = i16 + 1;
            j13 = i15 >> 31;
        }
        long j16 = j12;
        long j17 = j13;
        iArr[(i3 + i11) - 1] = (int) j17;
        iArr2[(i10 + i11) - 1] = (int) j16;
        int i18 = (int) (j17 >>> 63);
        int i19 = (int) (j16 >>> 63);
        zint_negate(iArr, i3, i11, i18);
        zint_negate(iArr2, i10, i11, i19);
        return (i19 << 1) | i18;
    }

    public void zint_co_reduce_mod(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11, int i12, int i13, long j, long j3, long j10, long j11) {
        int i14 = i12;
        long j12 = j;
        int i15 = iArr[i3];
        int i16 = iArr2[i10];
        int i17 = IntCompanionObject.MAX_VALUE;
        int i18 = (((((int) j3) * i16) + (((int) j12) * i15)) * i13) & IntCompanionObject.MAX_VALUE;
        int i19 = (((i16 * ((int) j11)) + (i15 * ((int) j10))) * i13) & IntCompanionObject.MAX_VALUE;
        int i20 = 0;
        long j13 = 0;
        long j14 = 0;
        while (i20 < i14) {
            int i21 = i3 + i20;
            int i22 = i10 + i20;
            int i23 = i17;
            int i24 = i20;
            long j15 = iArr[i21];
            long j16 = iArr2[i22];
            int i25 = i11 + i24;
            long i26 = u.i(iArr3[i25], toUnsignedLong(i18), (j16 * j3) + (j15 * j12), j13);
            long i27 = u.i(iArr3[i25], toUnsignedLong(i19), (j16 * j11) + (j15 * j10), j14);
            if (i24 > 0) {
                iArr[i21 - 1] = ((int) i26) & i23;
                iArr2[i22 - 1] = ((int) i27) & i23;
            }
            j13 = i26 >> 31;
            j14 = i27 >> 31;
            i20 = i24 + 1;
            i14 = i12;
            j12 = j;
            i17 = i23;
        }
        long j17 = j13;
        long j18 = j14;
        iArr[(i3 + i12) - 1] = (int) j17;
        iArr2[(i10 + i12) - 1] = (int) j18;
        zint_finish_mod(iArr, i3, i12, iArr3, i11, (int) (j17 >>> 63));
        zint_finish_mod(iArr2, i10, i12, iArr3, i11, (int) (j18 >>> 63));
    }

    public void zint_finish_mod(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = ((iArr[i3 + i14] - iArr2[i11 + i14]) - i13) >>> 31;
        }
        int i15 = (-i12) >>> 1;
        int i16 = -((1 - i13) | i12);
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = i3 + i17;
            int i19 = (iArr[i18] - ((iArr2[i11 + i17] ^ i15) & i16)) - i12;
            iArr[i18] = Integer.MAX_VALUE & i19;
            i12 = i19 >>> 31;
        }
    }

    public int zint_mod_small_signed(int[] iArr, int i3, int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i3, i10, i11, i12, i13), (-(iArr[(i3 + i10) - 1] >>> 30)) & i14, i11);
    }

    public int zint_mod_small_unsigned(int[] iArr, int i3, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        while (true) {
            int i15 = i10 - 1;
            if (i10 <= 0) {
                return i14;
            }
            int modp_montymul = modp_montymul(i14, i13, i11, i12);
            int i16 = iArr[i3 + i15] - i11;
            i14 = modp_add(modp_montymul, i16 + ((-(i16 >>> 31)) & i11), i11);
            i10 = i15;
        }
    }

    public int zint_mul_small(int[] iArr, int i3, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i3 + i13;
            long unsignedLong = (toUnsignedLong(iArr[i14]) * toUnsignedLong(i11)) + i12;
            iArr[i14] = ((int) unsignedLong) & IntCompanionObject.MAX_VALUE;
            i12 = (int) (unsignedLong >> 31);
        }
        return i12;
    }

    public void zint_negate(int[] iArr, int i3, int i10, int i11) {
        int i12 = (-i11) >>> 1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i3 + i13;
            int i15 = (iArr[i14] ^ i12) + i11;
            iArr[i14] = Integer.MAX_VALUE & i15;
            i11 = i15 >>> 31;
        }
    }

    public void zint_norm_zero(int[] iArr, int i3, int[] iArr2, int i10, int i11) {
        int i12 = 0;
        int i13 = i11;
        int i14 = 0;
        while (true) {
            int i15 = i13 - 1;
            if (i13 <= 0) {
                zint_sub(iArr, i3, iArr2, i10, i11, i12 >>> 31);
                return;
            }
            int i16 = iArr[i3 + i15];
            int i17 = iArr2[i10 + i15];
            int i18 = ((i14 << 30) | (i17 >>> 1)) - i16;
            i12 |= ((-(i18 >>> 31)) | ((-i18) >>> 31)) & ((i12 & 1) - 1);
            i13 = i15;
            i14 = i17 & 1;
        }
    }

    public int zint_one_to_plain(int[] iArr, int i3) {
        int i10 = iArr[i3];
        return i10 | ((1073741824 & i10) << 1);
    }

    public void zint_rebuild_CRT(int[] iArr, int i3, int i10, int i11, int i12, FalconSmallPrime[] falconSmallPrimeArr, int i13, int[] iArr2, int i14) {
        FalconKeyGen falconKeyGen = this;
        int i15 = 0;
        iArr2[i14] = falconSmallPrimeArr[0].f19390p;
        int i16 = 1;
        int i17 = i10;
        while (true) {
            int i18 = i16;
            if (i18 >= i17) {
                break;
            }
            FalconSmallPrime falconSmallPrime = falconSmallPrimeArr[i18];
            int i19 = falconSmallPrime.f19390p;
            int i20 = falconSmallPrime.f19391s;
            int modp_ninv31 = falconKeyGen.modp_ninv31(i19);
            int modp_R2 = falconKeyGen.modp_R2(i19, modp_ninv31);
            int i21 = i3;
            int i22 = 0;
            while (i22 < i12) {
                int i23 = i19;
                int i24 = modp_ninv31;
                int i25 = modp_R2;
                int modp_montymul = falconKeyGen.modp_montymul(i20, falconKeyGen.modp_sub(iArr[i21 + i18], falconKeyGen.zint_mod_small_unsigned(iArr, i21, i18, i19, modp_ninv31, modp_R2), i23), i23, i24);
                int i26 = i18;
                falconKeyGen.zint_add_mul_small(iArr, i21, iArr2, i14, i26, modp_montymul);
                i22++;
                i21 += i11;
                i18 = i26;
                i19 = i23;
                modp_ninv31 = i24;
                modp_R2 = i25;
            }
            int i27 = i18;
            iArr2[i14 + i27] = falconKeyGen.zint_mul_small(iArr2, i14, i27, i19);
            i16 = i27 + 1;
        }
        int[] iArr3 = iArr2;
        int i28 = i14;
        if (i13 != 0) {
            int i29 = i3;
            while (i15 < i12) {
                falconKeyGen.zint_norm_zero(iArr, i29, iArr3, i28, i17);
                i15++;
                i29 += i11;
                falconKeyGen = this;
                i17 = i10;
                iArr3 = iArr2;
                i28 = i14;
            }
        }
    }

    public int zint_sub(int[] iArr, int i3, int[] iArr2, int i10, int i11, int i12) {
        int i13 = -i12;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = i3 + i15;
            int i17 = iArr[i16];
            int i18 = (i17 - iArr2[i10 + i15]) - i14;
            i14 = i18 >>> 31;
            iArr[i16] = i17 ^ (((i18 & IntCompanionObject.MAX_VALUE) ^ i17) & i13);
        }
        return i14;
    }

    public void zint_sub_scaled(int[] iArr, int i3, int i10, int[] iArr2, int i11, int i12, int i13, int i14) {
        if (i12 == 0) {
            return;
        }
        int i15 = (-(iArr2[(i11 + i12) - 1] >>> 30)) >>> 1;
        int i16 = 0;
        int i17 = i13;
        int i18 = 0;
        while (i17 < i10) {
            int i19 = i17 - i13;
            int i20 = i19 < i12 ? iArr2[i19 + i11] : i15;
            int i21 = i3 + i17;
            int i22 = (iArr[i21] - (i16 | ((i20 << i14) & IntCompanionObject.MAX_VALUE))) - i18;
            iArr[i21] = i22 & IntCompanionObject.MAX_VALUE;
            i18 = i22 >>> 31;
            i17++;
            i16 = i20 >>> (31 - i14);
        }
    }
}
