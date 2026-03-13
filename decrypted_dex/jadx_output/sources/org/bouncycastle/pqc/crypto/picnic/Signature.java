package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Signature {
    byte[] challengeBits;
    Proof[] proofs;
    byte[] salt = new byte[32];

    public static class Proof {
        byte[] communicatedBits;
        int[] inputShare;
        byte[] seed1;
        byte[] seed2;
        byte[] view3Commitment;
        byte[] view3UnruhG;

        public Proof(PicnicEngine picnicEngine) {
            int i3 = picnicEngine.seedSizeBytes;
            this.seed1 = new byte[i3];
            this.seed2 = new byte[i3];
            this.inputShare = new int[picnicEngine.stateSizeBytes];
            this.communicatedBits = new byte[picnicEngine.andSizeBytes];
            this.view3Commitment = new byte[picnicEngine.digestSizeBytes];
            int i10 = picnicEngine.UnruhGWithInputBytes;
            if (i10 > 0) {
                this.view3UnruhG = new byte[i10];
            } else {
                this.view3UnruhG = null;
            }
        }
    }

    public Signature(PicnicEngine picnicEngine) {
        this.challengeBits = new byte[Utils.numBytes(picnicEngine.numMPCRounds * 2)];
        this.proofs = new Proof[picnicEngine.numMPCRounds];
        int i3 = 0;
        while (true) {
            Proof[] proofArr = this.proofs;
            if (i3 >= proofArr.length) {
                return;
            }
            proofArr[i3] = new Proof(picnicEngine);
            i3++;
        }
    }
}
