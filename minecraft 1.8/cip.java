/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ 
/*   3:    */ public class cip
/*   4:    */   extends cil
/*   5:    */ {
/*   6:    */   private boolean a;
/*   7:    */   private int b;
/*   8:    */   private double c;
/*   9:    */   private double d;
/*  10:    */   private double e;
/*  11:    */   private double f;
/*  12:    */   private double g;
/*  13:    */   
/*  14:    */   public cip(aqu paramaqu, GameProfile paramGameProfile)
/*  15:    */   {
/*  16: 23 */     super(paramaqu, paramGameProfile);
/*  17:    */     
/*  18: 25 */     this.S = 0.0F;
/*  19: 26 */     this.T = true;
/*  20:    */     
/*  21: 28 */     this.bX = 0.25F;
/*  22:    */     
/*  23: 30 */     this.j = 10.0D;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean a(wh paramwh, float paramFloat)
/*  27:    */   {
/*  28: 35 */     return true;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/*  32:    */   {
/*  33: 40 */     this.c = paramDouble1;
/*  34: 41 */     this.d = paramDouble2;
/*  35: 42 */     this.e = paramDouble3;
/*  36: 43 */     this.f = paramFloat1;
/*  37: 44 */     this.g = paramFloat2;
/*  38:    */     
/*  39: 46 */     this.b = paramInt;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void s_()
/*  43:    */   {
/*  44: 51 */     this.bX = 0.0F;
/*  45: 52 */     super.s_();
/*  46:    */     
/*  47: 54 */     this.ay = this.az;
/*  48: 55 */     double d1 = this.s - this.p;
/*  49: 56 */     double d2 = this.u - this.r;
/*  50: 57 */     float f1 = uv.a(d1 * d1 + d2 * d2) * 4.0F;
/*  51: 58 */     if (f1 > 1.0F) {
/*  52: 59 */       f1 = 1.0F;
/*  53:    */     }
/*  54: 61 */     this.az += (f1 - this.az) * 0.4F;
/*  55: 62 */     this.aA += this.az;
/*  56: 64 */     if ((!this.a) && (az()) && (this.bg.a[this.bg.c] != null))
/*  57:    */     {
/*  58: 65 */       amj localamj = this.bg.a[this.bg.c];
/*  59: 66 */       a(this.bg.a[this.bg.c], localamj.b().d(localamj));
/*  60: 67 */       this.a = true;
/*  61:    */     }
/*  62: 68 */     else if ((this.a) && (!az()))
/*  63:    */     {
/*  64: 69 */       bU();
/*  65: 70 */       this.a = false;
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void m()
/*  70:    */   {
/*  71: 76 */     if (this.b > 0)
/*  72:    */     {
/*  73: 77 */       double d1 = this.s + (this.c - this.s) / this.b;
/*  74: 78 */       double d2 = this.t + (this.d - this.t) / this.b;
/*  75: 79 */       double d3 = this.u + (this.e - this.u) / this.b;
/*  76:    */       
/*  77: 81 */       double d4 = this.f - this.y;
/*  78: 82 */       while (d4 < -180.0D) {
/*  79: 83 */         d4 += 360.0D;
/*  80:    */       }
/*  81: 85 */       while (d4 >= 180.0D) {
/*  82: 86 */         d4 -= 360.0D;
/*  83:    */       }
/*  84: 89 */       this.y = ((float)(this.y + d4 / this.b));
/*  85: 90 */       this.z = ((float)(this.z + (this.g - this.z) / this.b));
/*  86:    */       
/*  87: 92 */       this.b -= 1;
/*  88: 93 */       b(d1, d2, d3);
/*  89: 94 */       b(this.y, this.z);
/*  90:    */     }
/*  91: 96 */     this.bl = this.bm;
/*  92:    */     
/*  93: 98 */     bw();
/*  94:    */     
/*  95:100 */     float f1 = uv.a(this.v * this.v + this.x * this.x);
/*  96:101 */     float f2 = (float)Math.atan(-this.w * 0.2000000029802322D) * 15.0F;
/*  97:102 */     if (f1 > 0.1F) {
/*  98:103 */       f1 = 0.1F;
/*  99:    */     }
/* 100:105 */     if ((!this.C) || (bm() <= 0.0F)) {
/* 101:106 */       f1 = 0.0F;
/* 102:    */     }
/* 103:108 */     if ((this.C) || (bm() <= 0.0F)) {
/* 104:109 */       f2 = 0.0F;
/* 105:    */     }
/* 106:111 */     this.bm += (f1 - this.bm) * 0.4F;
/* 107:112 */     this.aD += (f2 - this.aD) * 0.8F;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void c(int paramInt, amj paramamj)
/* 111:    */   {
/* 112:117 */     if (paramInt == 0) {
/* 113:118 */       this.bg.a[this.bg.c] = paramamj;
/* 114:    */     } else {
/* 115:120 */       this.bg.b[(paramInt - 1)] = paramamj;
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void a(ho paramho)
/* 120:    */   {
/* 121:126 */     bsu.z().q.d().a(paramho);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public boolean a(int paramInt, String paramString)
/* 125:    */   {
/* 126:131 */     return false;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public dt c()
/* 130:    */   {
/* 131:136 */     return new dt(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D);
/* 132:    */   }
/* 133:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cip
 * JD-Core Version:    0.7.0.1
 */