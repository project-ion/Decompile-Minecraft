/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class abq
/*   4:    */   extends ws
/*   5:    */   implements wt
/*   6:    */ {
/*   7: 20 */   protected atr bl = aty.c;
/*   8:    */   private int bk;
/*   9:    */   private ahd bm;
/*  10:    */   
/*  11:    */   public abq(aqu paramaqu)
/*  12:    */   {
/*  13: 25 */     super(paramaqu);
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void E()
/*  17:    */   {
/*  18: 30 */     if (l() != 0) {
/*  19: 31 */       this.bk = 0;
/*  20:    */     }
/*  21: 33 */     super.E();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void m()
/*  25:    */   {
/*  26: 38 */     super.m();
/*  27: 40 */     if (l() != 0) {
/*  28: 41 */       this.bk = 0;
/*  29:    */     }
/*  30: 44 */     if (this.bk > 0)
/*  31:    */     {
/*  32: 45 */       this.bk -= 1;
/*  33: 46 */       if (this.bk % 10 == 0)
/*  34:    */       {
/*  35: 47 */         double d1 = this.V.nextGaussian() * 0.02D;
/*  36: 48 */         double d2 = this.V.nextGaussian() * 0.02D;
/*  37: 49 */         double d3 = this.V.nextGaussian() * 0.02D;
/*  38: 50 */         this.o.a(ew.I, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/*  39:    */       }
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean a(wh paramwh, float paramFloat)
/*  44:    */   {
/*  45: 57 */     if (b(paramwh)) {
/*  46: 58 */       return false;
/*  47:    */     }
/*  48: 60 */     this.bk = 0;
/*  49: 61 */     return super.a(paramwh, paramFloat);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public float a(dt paramdt)
/*  53:    */   {
/*  54: 66 */     if (this.o.p(paramdt.b()).c() == aty.c) {
/*  55: 67 */       return 10.0F;
/*  56:    */     }
/*  57: 69 */     return this.o.o(paramdt) - 0.5F;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void b(fn paramfn)
/*  61:    */   {
/*  62: 74 */     super.b(paramfn);
/*  63: 75 */     paramfn.a("InLove", this.bk);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(fn paramfn)
/*  67:    */   {
/*  68: 80 */     super.a(paramfn);
/*  69: 81 */     this.bk = paramfn.f("InLove");
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean bQ()
/*  73:    */   {
/*  74: 86 */     int i = uv.c(this.s);
/*  75: 87 */     int j = uv.c(aQ().b);
/*  76: 88 */     int k = uv.c(this.u);
/*  77: 89 */     dt localdt = new dt(i, j, k);
/*  78: 90 */     return (this.o.p(localdt.b()).c() == this.bl) && (this.o.k(localdt) > 8) && (super.bQ());
/*  79:    */   }
/*  80:    */   
/*  81:    */   public int w()
/*  82:    */   {
/*  83: 95 */     return 120;
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected boolean C()
/*  87:    */   {
/*  88:100 */     return false;
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected int b(ahd paramahd)
/*  92:    */   {
/*  93:105 */     return 1 + this.o.s.nextInt(3);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean d(amj paramamj)
/*  97:    */   {
/*  98:109 */     if (paramamj == null) {
/*  99:110 */       return false;
/* 100:    */     }
/* 101:112 */     return paramamj.b() == amk.O;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean a(ahd paramahd)
/* 105:    */   {
/* 106:117 */     amj localamj = paramahd.bg.h();
/* 107:118 */     if (localamj != null)
/* 108:    */     {
/* 109:119 */       if ((d(localamj)) && (l() == 0) && (this.bk <= 0))
/* 110:    */       {
/* 111:120 */         a(paramahd, localamj);
/* 112:121 */         c(paramahd);
/* 113:122 */         return true;
/* 114:    */       }
/* 115:123 */       if ((i_()) && (d(localamj)))
/* 116:    */       {
/* 117:124 */         a(paramahd, localamj);
/* 118:125 */         a((int)(-l() / 20 * 0.1F), true);
/* 119:126 */         return true;
/* 120:    */       }
/* 121:    */     }
/* 122:129 */     return super.a(paramahd);
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected void a(ahd paramahd, amj paramamj)
/* 126:    */   {
/* 127:133 */     if (!paramahd.by.d)
/* 128:    */     {
/* 129:134 */       paramamj.b -= 1;
/* 130:135 */       if (paramamj.b <= 0) {
/* 131:136 */         paramahd.bg.a(paramahd.bg.c, null);
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void c(ahd paramahd)
/* 137:    */   {
/* 138:142 */     this.bk = 600;
/* 139:143 */     this.bm = paramahd;
/* 140:    */     
/* 141:145 */     this.o.a(this, (byte)18);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public ahd co()
/* 145:    */   {
/* 146:149 */     return this.bm;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public boolean cp()
/* 150:    */   {
/* 151:153 */     return this.bk > 0;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void cq()
/* 155:    */   {
/* 156:157 */     this.bk = 0;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean a(abq paramabq)
/* 160:    */   {
/* 161:161 */     if (paramabq == this) {
/* 162:162 */       return false;
/* 163:    */     }
/* 164:164 */     if (paramabq.getClass() != getClass()) {
/* 165:165 */       return false;
/* 166:    */     }
/* 167:167 */     return (cp()) && (paramabq.cp());
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(byte paramByte)
/* 171:    */   {
/* 172:172 */     if (paramByte == 18) {
/* 173:173 */       for (int i = 0; i < 7; i++)
/* 174:    */       {
/* 175:174 */         double d1 = this.V.nextGaussian() * 0.02D;
/* 176:175 */         double d2 = this.V.nextGaussian() * 0.02D;
/* 177:176 */         double d3 = this.V.nextGaussian() * 0.02D;
/* 178:177 */         this.o.a(ew.I, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/* 179:    */       }
/* 180:    */     } else {
/* 181:180 */       super.a(paramByte);
/* 182:    */     }
/* 183:    */   }
/* 184:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abq
 * JD-Core Version:    0.7.0.1
 */