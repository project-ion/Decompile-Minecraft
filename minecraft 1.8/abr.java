/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class abr
/*   4:    */   extends abq
/*   5:    */ {
/*   6:    */   public float bk;
/*   7:    */   public float bm;
/*   8:    */   public float bn;
/*   9:    */   public float bo;
/*  10: 22 */   public float bp = 1.0F;
/*  11:    */   public int bq;
/*  12:    */   public boolean br;
/*  13:    */   
/*  14:    */   public abr(aqu paramaqu)
/*  15:    */   {
/*  16: 27 */     super(paramaqu);
/*  17: 28 */     a(0.4F, 0.7F);
/*  18: 29 */     this.bq = (this.V.nextInt(6000) + 6000);
/*  19:    */     
/*  20: 31 */     this.i.a(0, new yy(this));
/*  21: 32 */     this.i.a(1, new zu(this, 1.4D));
/*  22: 33 */     this.i.a(2, new yt(this, 1.0D));
/*  23: 34 */     this.i.a(3, new aag(this, 1.0D, amk.N, false));
/*  24: 35 */     this.i.a(4, new za(this, 1.1D));
/*  25: 36 */     this.i.a(5, new zy(this, 1.0D));
/*  26: 37 */     this.i.a(6, new zh(this, ahd.class, 6.0F));
/*  27: 38 */     this.i.a(7, new zx(this));
/*  28:    */   }
/*  29:    */   
/*  30:    */   public float aR()
/*  31:    */   {
/*  32: 43 */     return this.K;
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected void aW()
/*  36:    */   {
/*  37: 48 */     super.aW();
/*  38:    */     
/*  39: 50 */     a(afs.a).a(4.0D);
/*  40: 51 */     a(afs.d).a(0.25D);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void m()
/*  44:    */   {
/*  45: 56 */     super.m();
/*  46:    */     
/*  47: 58 */     this.bo = this.bk;
/*  48: 59 */     this.bn = this.bm;
/*  49:    */     
/*  50: 61 */     this.bm = ((float)(this.bm + (this.C ? -1 : 4) * 0.3D));
/*  51: 62 */     this.bm = uv.a(this.bm, 0.0F, 1.0F);
/*  52: 64 */     if ((!this.C) && (this.bp < 1.0F)) {
/*  53: 65 */       this.bp = 1.0F;
/*  54:    */     }
/*  55: 67 */     this.bp = ((float)(this.bp * 0.9D));
/*  56: 69 */     if ((!this.C) && (this.w < 0.0D)) {
/*  57: 70 */       this.w *= 0.6D;
/*  58:    */     }
/*  59: 73 */     this.bk += this.bp * 2.0F;
/*  60: 75 */     if ((!this.o.D) && (!i_()) && (!cj()) && (--this.bq <= 0))
/*  61:    */     {
/*  62: 76 */       a("mob.chicken.plop", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
/*  63: 77 */       a(amk.aP, 1);
/*  64: 78 */       this.bq = (this.V.nextInt(6000) + 6000);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void e(float paramFloat1, float paramFloat2) {}
/*  69:    */   
/*  70:    */   protected String z()
/*  71:    */   {
/*  72: 88 */     return "mob.chicken.say";
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected String bn()
/*  76:    */   {
/*  77: 93 */     return "mob.chicken.hurt";
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected String bo()
/*  81:    */   {
/*  82: 98 */     return "mob.chicken.hurt";
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected void a(dt paramdt, atr paramatr)
/*  86:    */   {
/*  87:103 */     a("mob.chicken.step", 0.15F, 1.0F);
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected alq A()
/*  91:    */   {
/*  92:108 */     return amk.G;
/*  93:    */   }
/*  94:    */   
/*  95:    */   protected void b(boolean paramBoolean, int paramInt)
/*  96:    */   {
/*  97:114 */     int i = this.V.nextInt(3) + this.V.nextInt(1 + paramInt);
/*  98:115 */     for (int j = 0; j < i; j++) {
/*  99:116 */       a(amk.G, 1);
/* 100:    */     }
/* 101:119 */     if (au()) {
/* 102:120 */       a(amk.bl, 1);
/* 103:    */     } else {
/* 104:122 */       a(amk.bk, 1);
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public abr b(ws paramws)
/* 109:    */   {
/* 110:128 */     return new abr(this.o);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean d(amj paramamj)
/* 114:    */   {
/* 115:133 */     return (paramamj != null) && (paramamj.b() == amk.N);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(fn paramfn)
/* 119:    */   {
/* 120:138 */     super.a(paramfn);
/* 121:139 */     this.br = paramfn.n("IsChickenJockey");
/* 122:140 */     if (paramfn.c("EggLayTime")) {
/* 123:141 */       this.bq = paramfn.f("EggLayTime");
/* 124:    */     }
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected int b(ahd paramahd)
/* 128:    */   {
/* 129:147 */     if (cj()) {
/* 130:148 */       return 10;
/* 131:    */     }
/* 132:150 */     return super.b(paramahd);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void b(fn paramfn)
/* 136:    */   {
/* 137:155 */     super.b(paramfn);
/* 138:156 */     paramfn.a("IsChickenJockey", this.br);
/* 139:157 */     paramfn.a("EggLayTime", this.bq);
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected boolean C()
/* 143:    */   {
/* 144:162 */     return (cj()) && (this.l == null);
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void al()
/* 148:    */   {
/* 149:167 */     super.al();
/* 150:168 */     float f1 = uv.a(this.aG * 3.141593F / 180.0F);
/* 151:169 */     float f2 = uv.b(this.aG * 3.141593F / 180.0F);
/* 152:170 */     float f3 = 0.1F;
/* 153:171 */     float f4 = 0.0F;
/* 154:    */     
/* 155:173 */     this.l.b(this.s + f3 * f1, this.t + this.K * 0.5F + this.l.am() + f4, this.u - f3 * f2);
/* 156:174 */     if ((this.l instanceof xm)) {
/* 157:175 */       ((xm)this.l).aG = this.aG;
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   public boolean cj()
/* 162:    */   {
/* 163:180 */     return this.br;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void l(boolean paramBoolean)
/* 167:    */   {
/* 168:184 */     this.br = paramBoolean;
/* 169:    */   }
/* 170:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abr
 * JD-Core Version:    0.7.0.1
 */