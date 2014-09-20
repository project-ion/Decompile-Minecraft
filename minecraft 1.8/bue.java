/*   1:    */ import java.util.Map;
/*   2:    */ 
/*   3:    */ class bue
/*   4:    */ {
/*   5:    */   private final bqe b;
/*   6:    */   private final ctp c;
/*   7:    */   private final oa d;
/*   8:    */   private final int[] e;
/*   9:    */   
/*  10:    */   private bue(buc parambuc, bqe parambqe)
/*  11:    */   {
/*  12: 63 */     this.b = parambqe;
/*  13: 64 */     this.c = new ctp(128, 128);
/*  14: 65 */     this.e = this.c.e();
/*  15: 66 */     this.d = buc.a(parambuc).a("map/" + parambqe.a, this.c);
/*  16: 69 */     for (int i = 0; i < this.e.length; i++) {
/*  17: 70 */       this.e[i] = 0;
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   private void a()
/*  22:    */   {
/*  23: 75 */     for (int i = 0; i < 16384; i++)
/*  24:    */     {
/*  25: 76 */       int j = this.b.f[i] & 0xFF;
/*  26: 77 */       if (j / 4 == 0) {
/*  27: 78 */         this.e[i] = ((i + i / 128 & 0x1) * 8 + 16 << 24);
/*  28:    */       } else {
/*  29: 80 */         this.e[i] = boh.a[(j / 4)].a(j & 0x3);
/*  30:    */       }
/*  31:    */     }
/*  32: 84 */     this.c.d();
/*  33:    */   }
/*  34:    */   
/*  35:    */   private void a(boolean paramBoolean)
/*  36:    */   {
/*  37: 88 */     int i = 0;
/*  38: 89 */     int j = 0;
/*  39: 90 */     ckx localckx = ckx.a();
/*  40: 91 */     civ localciv = localckx.c();
/*  41:    */     
/*  42: 93 */     float f1 = 0.0F;
/*  43:    */     
/*  44: 95 */     buc.a(this.a).a(this.d);
/*  45: 96 */     cjm.l();
/*  46: 97 */     cjm.a(1, 771, 0, 1);
/*  47: 98 */     cjm.c();
/*  48: 99 */     localciv.b();
/*  49:100 */     localciv.a(i + 0 + f1, j + 128 - f1, -0.009999999776482582D, 0.0D, 1.0D);
/*  50:101 */     localciv.a(i + 128 - f1, j + 128 - f1, -0.009999999776482582D, 1.0D, 1.0D);
/*  51:102 */     localciv.a(i + 128 - f1, j + 0 + f1, -0.009999999776482582D, 1.0D, 0.0D);
/*  52:103 */     localciv.a(i + 0 + f1, j + 0 + f1, -0.009999999776482582D, 0.0D, 0.0D);
/*  53:104 */     localckx.b();
/*  54:105 */     cjm.d();
/*  55:106 */     cjm.k();
/*  56:    */     
/*  57:108 */     buc.a(this.a).a(buc.b());
/*  58:109 */     int k = 0;
/*  59:110 */     for (bqd localbqd : this.b.h.values()) {
/*  60:111 */       if ((!paramBoolean) || (localbqd.a() == 1))
/*  61:    */       {
/*  62:114 */         cjm.E();
/*  63:115 */         cjm.b(i + localbqd.b() / 2.0F + 64.0F, j + localbqd.c() / 2.0F + 64.0F, -0.02F);
/*  64:116 */         cjm.b(localbqd.d() * 360 / 16.0F, 0.0F, 0.0F, 1.0F);
/*  65:117 */         cjm.a(4.0F, 4.0F, 3.0F);
/*  66:118 */         cjm.b(-0.125F, 0.125F, 0.0F);
/*  67:    */         
/*  68:120 */         int m = localbqd.a();
/*  69:121 */         float f2 = (m % 4 + 0) / 4.0F;
/*  70:122 */         float f3 = (m / 4 + 0) / 4.0F;
/*  71:123 */         float f4 = (m % 4 + 1) / 4.0F;
/*  72:124 */         float f5 = (m / 4 + 1) / 4.0F;
/*  73:    */         
/*  74:126 */         localciv.b();
/*  75:127 */         localciv.a(-1.0D, 1.0D, k * 0.001F, f2, f3);
/*  76:128 */         localciv.a(1.0D, 1.0D, k * 0.001F, f4, f3);
/*  77:129 */         localciv.a(1.0D, -1.0D, k * 0.001F, f4, f5);
/*  78:130 */         localciv.a(-1.0D, -1.0D, k * 0.001F, f2, f5);
/*  79:131 */         localckx.b();
/*  80:132 */         cjm.F();
/*  81:133 */         k++;
/*  82:    */       }
/*  83:    */     }
/*  84:136 */     cjm.E();
/*  85:137 */     cjm.b(0.0F, 0.0F, -0.04F);
/*  86:138 */     cjm.a(1.0F, 1.0F, 1.0F);
/*  87:139 */     cjm.F();
/*  88:    */   }
/*  89:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bue
 * JD-Core Version:    0.7.0.1
 */