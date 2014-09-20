/*   1:    */ import java.util.Calendar;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class abo
/*   5:    */   extends abn
/*   6:    */ {
/*   7:    */   private dt a;
/*   8:    */   
/*   9:    */   public abo(aqu paramaqu)
/*  10:    */   {
/*  11: 22 */     super(paramaqu);
/*  12:    */     
/*  13: 24 */     a(0.5F, 0.9F);
/*  14: 25 */     a(true);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected void h()
/*  18:    */   {
/*  19: 30 */     super.h();
/*  20:    */     
/*  21: 32 */     this.ac.a(16, new Byte((byte)0));
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected float bA()
/*  25:    */   {
/*  26: 37 */     return 0.1F;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected float bB()
/*  30:    */   {
/*  31: 42 */     return super.bB() * 0.95F;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected String z()
/*  35:    */   {
/*  36: 47 */     if ((n()) && (this.V.nextInt(4) != 0)) {
/*  37: 48 */       return null;
/*  38:    */     }
/*  39: 50 */     return "mob.bat.idle";
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected String bn()
/*  43:    */   {
/*  44: 55 */     return "mob.bat.hurt";
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected String bo()
/*  48:    */   {
/*  49: 60 */     return "mob.bat.death";
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean ae()
/*  53:    */   {
/*  54: 66 */     return false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void s(wv paramwv) {}
/*  58:    */   
/*  59:    */   protected void bK() {}
/*  60:    */   
/*  61:    */   protected void aW()
/*  62:    */   {
/*  63: 81 */     super.aW();
/*  64:    */     
/*  65: 83 */     a(afs.a).a(6.0D);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean n()
/*  69:    */   {
/*  70: 87 */     return (this.ac.a(16) & 0x1) != 0;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(boolean paramBoolean)
/*  74:    */   {
/*  75: 91 */     int i = this.ac.a(16);
/*  76: 92 */     if (paramBoolean) {
/*  77: 93 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x1)));
/*  78:    */     } else {
/*  79: 95 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/*  80:    */     }
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void s_()
/*  84:    */   {
/*  85:101 */     super.s_();
/*  86:103 */     if (n())
/*  87:    */     {
/*  88:104 */       this.v = (this.w = this.x = 0.0D);
/*  89:105 */       this.t = (uv.c(this.t) + 1.0D - this.K);
/*  90:    */     }
/*  91:    */     else
/*  92:    */     {
/*  93:107 */       this.w *= 0.6000000238418579D;
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void E()
/*  98:    */   {
/*  99:113 */     super.E();
/* 100:    */     
/* 101:115 */     dt localdt1 = new dt(this);
/* 102:116 */     dt localdt2 = localdt1.a();
/* 103:118 */     if (n())
/* 104:    */     {
/* 105:119 */       if (!this.o.p(localdt2).c().t())
/* 106:    */       {
/* 107:120 */         a(false);
/* 108:121 */         this.o.a(null, 1015, localdt1, 0);
/* 109:    */       }
/* 110:    */       else
/* 111:    */       {
/* 112:123 */         if (this.V.nextInt(200) == 0) {
/* 113:124 */           this.aI = this.V.nextInt(360);
/* 114:    */         }
/* 115:127 */         if (this.o.a(this, 4.0D) != null)
/* 116:    */         {
/* 117:128 */           a(false);
/* 118:129 */           this.o.a(null, 1015, localdt1, 0);
/* 119:    */         }
/* 120:    */       }
/* 121:    */     }
/* 122:    */     else
/* 123:    */     {
/* 124:133 */       if ((this.a != null) && ((!this.o.d(this.a)) || (this.a.o() < 1))) {
/* 125:134 */         this.a = null;
/* 126:    */       }
/* 127:136 */       if ((this.a == null) || (this.V.nextInt(30) == 0) || (this.a.c((int)this.s, (int)this.t, (int)this.u) < 4.0D)) {
/* 128:137 */         this.a = new dt((int)this.s + this.V.nextInt(7) - this.V.nextInt(7), (int)this.t + this.V.nextInt(6) - 2, (int)this.u + this.V.nextInt(7) - this.V.nextInt(7));
/* 129:    */       }
/* 130:140 */       double d1 = this.a.n() + 0.5D - this.s;
/* 131:141 */       double d2 = this.a.o() + 0.1D - this.t;
/* 132:142 */       double d3 = this.a.p() + 0.5D - this.u;
/* 133:    */       
/* 134:144 */       this.v += (Math.signum(d1) * 0.5D - this.v) * 0.1000000014901161D;
/* 135:145 */       this.w += (Math.signum(d2) * 0.699999988079071D - this.w) * 0.1000000014901161D;
/* 136:146 */       this.x += (Math.signum(d3) * 0.5D - this.x) * 0.1000000014901161D;
/* 137:    */       
/* 138:148 */       float f1 = (float)(Math.atan2(this.x, this.v) * 180.0D / 3.141592741012573D) - 90.0F;
/* 139:149 */       float f2 = uv.g(f1 - this.y);
/* 140:150 */       this.aY = 0.5F;
/* 141:151 */       this.y += f2;
/* 142:153 */       if ((this.V.nextInt(100) == 0) && (this.o.p(localdt2).c().t())) {
/* 143:154 */         a(true);
/* 144:    */       }
/* 145:    */     }
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected boolean r_()
/* 149:    */   {
/* 150:161 */     return false;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 154:    */   
/* 155:    */   protected void a(double paramDouble, boolean paramBoolean, atr paramatr, dt paramdt) {}
/* 156:    */   
/* 157:    */   public boolean aH()
/* 158:    */   {
/* 159:176 */     return true;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean a(wh paramwh, float paramFloat)
/* 163:    */   {
/* 164:181 */     if (b(paramwh)) {
/* 165:182 */       return false;
/* 166:    */     }
/* 167:184 */     if ((!this.o.D) && 
/* 168:185 */       (n())) {
/* 169:186 */       a(false);
/* 170:    */     }
/* 171:190 */     return super.a(paramwh, paramFloat);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void a(fn paramfn)
/* 175:    */   {
/* 176:195 */     super.a(paramfn);
/* 177:    */     
/* 178:197 */     this.ac.b(16, Byte.valueOf(paramfn.d("BatFlags")));
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void b(fn paramfn)
/* 182:    */   {
/* 183:202 */     super.b(paramfn);
/* 184:    */     
/* 185:204 */     paramfn.a("BatFlags", this.ac.a(16));
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean bQ()
/* 189:    */   {
/* 190:209 */     dt localdt = new dt(this.s, aQ().b, this.u);
/* 191:210 */     if (localdt.o() >= 63) {
/* 192:211 */       return false;
/* 193:    */     }
/* 194:214 */     int i = this.o.l(localdt);
/* 195:215 */     int j = 4;
/* 196:217 */     if (a(this.o.Y())) {
/* 197:218 */       j = 7;
/* 198:219 */     } else if (this.V.nextBoolean()) {
/* 199:220 */       return false;
/* 200:    */     }
/* 201:223 */     if (i > this.V.nextInt(j)) {
/* 202:224 */       return false;
/* 203:    */     }
/* 204:227 */     return super.bQ();
/* 205:    */   }
/* 206:    */   
/* 207:    */   private boolean a(Calendar paramCalendar)
/* 208:    */   {
/* 209:231 */     return ((paramCalendar.get(2) + 1 == 10) && (paramCalendar.get(5) >= 20)) || ((paramCalendar.get(2) + 1 == 11) && (paramCalendar.get(5) <= 3));
/* 210:    */   }
/* 211:    */   
/* 212:    */   public float aR()
/* 213:    */   {
/* 214:236 */     return this.K / 2.0F;
/* 215:    */   }
/* 216:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abo
 * JD-Core Version:    0.7.0.1
 */