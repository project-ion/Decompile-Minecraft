/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class acq
/*   4:    */   extends abw
/*   5:    */ {
/*   6:    */   private int b;
/*   7:    */   abi a;
/*   8:    */   private int c;
/*   9:    */   private int bk;
/*  10:    */   
/*  11:    */   public acq(aqu paramaqu)
/*  12:    */   {
/*  13: 40 */     super(paramaqu);
/*  14: 41 */     a(1.4F, 2.9F);
/*  15:    */     
/*  16: 43 */     ((aay)s()).a(true);
/*  17:    */     
/*  18: 45 */     this.i.a(1, new zk(this, 1.0D, true));
/*  19: 46 */     this.i.a(2, new zp(this, 0.9D, 32.0F));
/*  20: 47 */     this.i.a(3, new zm(this, 0.6D, true));
/*  21: 48 */     this.i.a(4, new zo(this, 1.0D));
/*  22: 49 */     this.i.a(5, new zs(this));
/*  23: 50 */     this.i.a(6, new zy(this, 0.6D));
/*  24: 51 */     this.i.a(7, new zh(this, ahd.class, 6.0F));
/*  25: 52 */     this.i.a(8, new zx(this));
/*  26:    */     
/*  27: 54 */     this.bg.a(1, new aak(this));
/*  28: 55 */     this.bg.a(2, new aal(this, false, new Class[0]));
/*  29: 56 */     this.bg.a(3, new acr(this, xn.class, 10, false, true, aex.e));
/*  30:    */   }
/*  31:    */   
/*  32:    */   protected void h()
/*  33:    */   {
/*  34: 61 */     super.h();
/*  35: 62 */     this.ac.a(16, Byte.valueOf((byte)0));
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected void E()
/*  39:    */   {
/*  40: 67 */     if (--this.b <= 0)
/*  41:    */     {
/*  42: 68 */       this.b = (70 + this.V.nextInt(50));
/*  43: 69 */       this.a = this.o.ae().a(new dt(this), 32);
/*  44: 70 */       if (this.a == null)
/*  45:    */       {
/*  46: 71 */         ch();
/*  47:    */       }
/*  48:    */       else
/*  49:    */       {
/*  50: 73 */         dt localdt = this.a.a();
/*  51: 74 */         a(localdt, (int)(this.a.b() * 0.6F));
/*  52:    */       }
/*  53:    */     }
/*  54: 78 */     super.E();
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void aW()
/*  58:    */   {
/*  59: 83 */     super.aW();
/*  60:    */     
/*  61: 85 */     a(afs.a).a(100.0D);
/*  62: 86 */     a(afs.d).a(0.25D);
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected int j(int paramInt)
/*  66:    */   {
/*  67: 92 */     return paramInt;
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected void s(wv paramwv)
/*  71:    */   {
/*  72: 97 */     if (((paramwv instanceof aex)) && 
/*  73: 98 */       (bb().nextInt(20) == 0)) {
/*  74: 99 */       d((xm)paramwv);
/*  75:    */     }
/*  76:102 */     super.s(paramwv);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void m()
/*  80:    */   {
/*  81:107 */     super.m();
/*  82:109 */     if (this.c > 0) {
/*  83:110 */       this.c -= 1;
/*  84:    */     }
/*  85:112 */     if (this.bk > 0) {
/*  86:113 */       this.bk -= 1;
/*  87:    */     }
/*  88:116 */     if ((this.v * this.v + this.x * this.x > 2.500000277905201E-007D) && (this.V.nextInt(5) == 0))
/*  89:    */     {
/*  90:117 */       int i = uv.c(this.s);
/*  91:118 */       int j = uv.c(this.t - 0.2000000029802322D);
/*  92:119 */       int k = uv.c(this.u);
/*  93:120 */       bec localbec = this.o.p(new dt(i, j, k));
/*  94:121 */       atr localatr = localbec.c();
/*  95:122 */       if (localatr.r() != bof.a) {
/*  96:123 */         this.o.a(ew.L, this.s + (this.V.nextFloat() - 0.5D) * this.J, aQ().b + 0.1D, this.u + (this.V.nextFloat() - 0.5D) * this.J, 4.0D * (this.V.nextFloat() - 0.5D), 0.5D, (this.V.nextFloat() - 0.5D) * 4.0D, new int[] { atr.f(localbec) });
/*  97:    */       }
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   public boolean a(Class paramClass)
/* 102:    */   {
/* 103:130 */     if ((cl()) && (ahd.class.isAssignableFrom(paramClass))) {
/* 104:131 */       return false;
/* 105:    */     }
/* 106:133 */     return super.a(paramClass);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void b(fn paramfn)
/* 110:    */   {
/* 111:138 */     super.b(paramfn);
/* 112:139 */     paramfn.a("PlayerCreated", cl());
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void a(fn paramfn)
/* 116:    */   {
/* 117:144 */     super.a(paramfn);
/* 118:145 */     l(paramfn.n("PlayerCreated"));
/* 119:    */   }
/* 120:    */   
/* 121:    */   public boolean r(wv paramwv)
/* 122:    */   {
/* 123:150 */     this.c = 10;
/* 124:151 */     this.o.a(this, (byte)4);
/* 125:152 */     boolean bool = paramwv.a(wh.a(this), 7 + this.V.nextInt(15));
/* 126:153 */     if (bool)
/* 127:    */     {
/* 128:154 */       paramwv.w += 0.4000000059604645D;
/* 129:155 */       a(this, paramwv);
/* 130:    */     }
/* 131:157 */     a("mob.irongolem.throw", 1.0F, 1.0F);
/* 132:158 */     return bool;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void a(byte paramByte)
/* 136:    */   {
/* 137:163 */     if (paramByte == 4)
/* 138:    */     {
/* 139:164 */       this.c = 10;
/* 140:165 */       a("mob.irongolem.throw", 1.0F, 1.0F);
/* 141:    */     }
/* 142:166 */     else if (paramByte == 11)
/* 143:    */     {
/* 144:167 */       this.bk = 400;
/* 145:    */     }
/* 146:    */     else
/* 147:    */     {
/* 148:169 */       super.a(paramByte);
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public abi n()
/* 153:    */   {
/* 154:174 */     return this.a;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public int cj()
/* 158:    */   {
/* 159:178 */     return this.c;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void a(boolean paramBoolean)
/* 163:    */   {
/* 164:182 */     this.bk = (paramBoolean ? 400 : 0);
/* 165:183 */     this.o.a(this, (byte)11);
/* 166:    */   }
/* 167:    */   
/* 168:    */   protected String bn()
/* 169:    */   {
/* 170:188 */     return "mob.irongolem.hit";
/* 171:    */   }
/* 172:    */   
/* 173:    */   protected String bo()
/* 174:    */   {
/* 175:193 */     return "mob.irongolem.death";
/* 176:    */   }
/* 177:    */   
/* 178:    */   protected void a(dt paramdt, atr paramatr)
/* 179:    */   {
/* 180:198 */     a("mob.irongolem.walk", 1.0F, 1.0F);
/* 181:    */   }
/* 182:    */   
/* 183:    */   protected void b(boolean paramBoolean, int paramInt)
/* 184:    */   {
/* 185:203 */     int i = this.V.nextInt(3);
/* 186:204 */     for (int j = 0; j < i; j++) {
/* 187:205 */       a(alq.a(aty.O), 1, awa.b.b());
/* 188:    */     }
/* 189:207 */     j = 3 + this.V.nextInt(3);
/* 190:208 */     for (int k = 0; k < j; k++) {
/* 191:209 */       a(amk.j, 1);
/* 192:    */     }
/* 193:    */   }
/* 194:    */   
/* 195:    */   public int ck()
/* 196:    */   {
/* 197:214 */     return this.bk;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public boolean cl()
/* 201:    */   {
/* 202:218 */     return (this.ac.a(16) & 0x1) != 0;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void l(boolean paramBoolean)
/* 206:    */   {
/* 207:222 */     int i = this.ac.a(16);
/* 208:223 */     if (paramBoolean) {
/* 209:224 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x1)));
/* 210:    */     } else {
/* 211:226 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void a(wh paramwh)
/* 216:    */   {
/* 217:232 */     if ((!cl()) && (this.aL != null) && (this.a != null)) {
/* 218:233 */       this.a.a(this.aL.d_(), -5);
/* 219:    */     }
/* 220:235 */     super.a(paramwh);
/* 221:    */   }
/* 222:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     acq
 * JD-Core Version:    0.7.0.1
 */