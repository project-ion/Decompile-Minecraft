/*  1:   */ public class bpx
/*  2:   */   extends bpu
/*  3:   */ {
/*  4:   */   public void a(ard paramard, wv paramwv)
/*  5:   */   {
/*  6:20 */     super.a(paramard, paramwv);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void a()
/* 10:   */   {
/* 11:25 */     super.a();
/* 12:   */   }
/* 13:   */   
/* 14:   */   public bpt a(wv paramwv)
/* 15:   */   {
/* 16:30 */     return a(uv.c(paramwv.aQ().a), uv.c(paramwv.aQ().b + 0.5D), uv.c(paramwv.aQ().c));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public bpt a(wv paramwv, double paramDouble1, double paramDouble2, double paramDouble3)
/* 20:   */   {
/* 21:35 */     return a(uv.c(paramDouble1 - paramwv.J / 2.0F), uv.c(paramDouble2 + 0.5D), uv.c(paramDouble3 - paramwv.J / 2.0F));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int a(bpt[] paramArrayOfbpt, wv paramwv, bpt parambpt1, bpt parambpt2, float paramFloat)
/* 25:   */   {
/* 26:40 */     int i = 0;
/* 27:42 */     for (ej localej : ej.values())
/* 28:   */     {
/* 29:43 */       bpt localbpt = a(paramwv, parambpt1.a + localej.g(), parambpt1.b + localej.h(), parambpt1.c + localej.i());
/* 30:44 */       if ((localbpt != null) && (!localbpt.i) && (localbpt.a(parambpt2) < paramFloat)) {
/* 31:45 */         paramArrayOfbpt[(i++)] = localbpt;
/* 32:   */       }
/* 33:   */     }
/* 34:49 */     return i;
/* 35:   */   }
/* 36:   */   
/* 37:   */   private bpt a(wv paramwv, int paramInt1, int paramInt2, int paramInt3)
/* 38:   */   {
/* 39:53 */     int i = b(paramwv, paramInt1, paramInt2, paramInt3);
/* 40:54 */     if (i == -1) {
/* 41:55 */       return a(paramInt1, paramInt2, paramInt3);
/* 42:   */     }
/* 43:57 */     return null;
/* 44:   */   }
/* 45:   */   
/* 46:   */   private int b(wv paramwv, int paramInt1, int paramInt2, int paramInt3)
/* 47:   */   {
/* 48:61 */     for (int i = paramInt1; i < paramInt1 + this.c; i++) {
/* 49:62 */       for (int j = paramInt2; j < paramInt2 + this.d; j++) {
/* 50:63 */         for (int k = paramInt3; k < paramInt3 + this.e; k++)
/* 51:   */         {
/* 52:64 */           dt localdt = new dt(i, j, k);
/* 53:65 */           atr localatr = this.a.p(localdt).c();
/* 54:66 */           if (localatr.r() != bof.h) {
/* 55:67 */             return 0;
/* 56:   */           }
/* 57:   */         }
/* 58:   */       }
/* 59:   */     }
/* 60:72 */     return -1;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bpx
 * JD-Core Version:    0.7.0.1
 */