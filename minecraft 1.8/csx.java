/*  1:   */ public class csx
/*  2:   */   implements csq
/*  3:   */ {
/*  4:   */   private final crv a;
/*  5:   */   
/*  6:   */   public csx(crv paramcrv)
/*  7:   */   {
/*  8:19 */     this.a = paramcrv;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(agi paramagi, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:25 */     amj localamj = paramagi.bz();
/* 14:27 */     if (localamj == null) {
/* 15:28 */       return;
/* 16:   */     }
/* 17:31 */     cjm.c(1.0F, 1.0F, 1.0F);
/* 18:32 */     cjm.E();
/* 19:34 */     if (this.a.b().r)
/* 20:   */     {
/* 21:35 */       cjm.b(0.0F, 0.625F, 0.0F);
/* 22:36 */       cjm.b(-20.0F, -1.0F, 0.0F, 0.0F);
/* 23:   */       
/* 24:38 */       float f1 = 0.5F;
/* 25:39 */       cjm.a(f1, f1, f1);
/* 26:   */     }
/* 27:42 */     ((cdm)this.a.b()).f.c(0.0625F);
/* 28:43 */     cjm.b(-0.0625F, 0.53125F, 0.21875F);
/* 29:   */     
/* 30:45 */     alq localalq = localamj.b();
/* 31:46 */     bsu localbsu = bsu.z();
/* 32:   */     float f2;
/* 33:47 */     if (((localalq instanceof aju)) && (localbsu.ab().a(atr.a(localalq), localamj.i())))
/* 34:   */     {
/* 35:48 */       cjm.b(0.0F, 0.1875F, -0.3125F);
/* 36:49 */       cjm.b(20.0F, 1.0F, 0.0F, 0.0F);
/* 37:50 */       cjm.b(45.0F, 0.0F, 1.0F, 0.0F);
/* 38:   */       
/* 39:52 */       f2 = 0.375F;
/* 40:53 */       cjm.a(f2, -f2, f2);
/* 41:   */     }
/* 42:54 */     else if (localalq == amk.f)
/* 43:   */     {
/* 44:55 */       cjm.b(0.0F, 0.125F, 0.3125F);
/* 45:56 */       cjm.b(-20.0F, 0.0F, 1.0F, 0.0F);
/* 46:   */       
/* 47:58 */       f2 = 0.625F;
/* 48:59 */       cjm.a(f2, -f2, f2);
/* 49:60 */       cjm.b(-100.0F, 1.0F, 0.0F, 0.0F);
/* 50:61 */       cjm.b(45.0F, 0.0F, 1.0F, 0.0F);
/* 51:   */     }
/* 52:62 */     else if (localalq.v_())
/* 53:   */     {
/* 54:63 */       if (localalq.e())
/* 55:   */       {
/* 56:64 */         cjm.b(180.0F, 0.0F, 0.0F, 1.0F);
/* 57:65 */         cjm.b(0.0F, -0.125F, 0.0F);
/* 58:   */       }
/* 59:67 */       this.a.B_();
/* 60:   */       
/* 61:69 */       f2 = 0.625F;
/* 62:70 */       cjm.a(f2, -f2, f2);
/* 63:71 */       cjm.b(-100.0F, 1.0F, 0.0F, 0.0F);
/* 64:72 */       cjm.b(45.0F, 0.0F, 1.0F, 0.0F);
/* 65:   */     }
/* 66:   */     else
/* 67:   */     {
/* 68:74 */       cjm.b(0.25F, 0.1875F, -0.1875F);
/* 69:   */       
/* 70:76 */       f2 = 0.375F;
/* 71:77 */       cjm.a(f2, f2, f2);
/* 72:78 */       cjm.b(60.0F, 0.0F, 0.0F, 1.0F);
/* 73:79 */       cjm.b(-90.0F, 1.0F, 0.0F, 0.0F);
/* 74:80 */       cjm.b(20.0F, 0.0F, 0.0F, 1.0F);
/* 75:   */     }
/* 76:83 */     cjm.b(-15.0F, 1.0F, 0.0F, 0.0F);
/* 77:84 */     cjm.b(40.0F, 0.0F, 0.0F, 1.0F);
/* 78:   */     
/* 79:86 */     localbsu.ag().a(paramagi, localamj, cmz.b);
/* 80:87 */     cjm.F();
/* 81:   */   }
/* 82:   */   
/* 83:   */   public boolean b()
/* 84:   */   {
/* 85:92 */     return false;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csx
 * JD-Core Version:    0.7.0.1
 */