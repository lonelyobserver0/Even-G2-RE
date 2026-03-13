package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Signature2 {
    int[] challengeC;
    byte[] challengeHash;
    int[] challengeP;
    byte[] cvInfo;
    int cvInfoLen;
    byte[] iSeedInfo;
    int iSeedInfoLen;
    Proof2[] proofs;
    byte[] salt = new byte[32];

    public static class Proof2 {

        /* renamed from: C, reason: collision with root package name */
        byte[] f19460C;
        byte[] aux;
        byte[] input;
        byte[] msgs;
        byte[] seedInfo = null;
        int seedInfoLen = 0;

        public Proof2(PicnicEngine picnicEngine) {
            this.f19460C = new byte[picnicEngine.digestSizeBytes];
            this.input = new byte[picnicEngine.stateSizeBytes];
            int i3 = picnicEngine.andSizeBytes;
            this.aux = new byte[i3];
            this.msgs = new byte[i3];
        }
    }

    public Signature2(PicnicEngine picnicEngine) {
        this.challengeHash = new byte[picnicEngine.digestSizeBytes];
        int i3 = picnicEngine.numOpenedRounds;
        this.challengeC = new int[i3];
        this.challengeP = new int[i3];
        this.proofs = new Proof2[picnicEngine.numMPCRounds];
    }
}
