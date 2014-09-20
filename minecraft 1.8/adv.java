/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class adv
/*   6:    */   extends wv
/*   7:    */ {
/*   8:    */   private bec d;
/*   9:    */   public int a;
/*  10: 28 */   public boolean b = true;
/*  11:    */   private boolean e;
/*  12:    */   private boolean f;
/*  13: 31 */   private int g = 40;
/*  14: 32 */   private float h = 2.0F;
/*  15:    */   public fn c;
/*  16:    */   
/*  17:    */   public adv(aqu paramaqu)
/*  18:    */   {
/*  19: 36 */     super(paramaqu);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public adv(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, bec parambec)
/*  23:    */   {
/*  24: 40 */     super(paramaqu);
/*  25: 41 */     this.d = parambec;
/*  26: 42 */     this.k = true;
/*  27: 43 */     a(0.98F, 0.98F);
/*  28: 44 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  29:    */     
/*  30: 46 */     this.v = 0.0D;
/*  31: 47 */     this.w = 0.0D;
/*  32: 48 */     this.x = 0.0D;
/*  33:    */     
/*  34: 50 */     this.p = paramDouble1;
/*  35: 51 */     this.q = paramDouble2;
/*  36: 52 */     this.r = paramDouble3;
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected boolean r_()
/*  40:    */   {
/*  41: 57 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void h() {}
/*  45:    */   
/*  46:    */   public boolean ad()
/*  47:    */   {
/*  48: 66 */     return !this.I;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void s_()
/*  52:    */   {
/*  53: 71 */     atr localatr = this.d.c();
/*  54: 72 */     if (localatr.r() == bof.a)
/*  55:    */     {
/*  56: 73 */       J();
/*  57: 74 */       return;
/*  58:    */     }
/*  59: 77 */     this.p = this.s;
/*  60: 78 */     this.q = this.t;
/*  61: 79 */     this.r = this.u;
/*  62:    */     dt localdt;
/*  63: 81 */     if (this.a++ == 0)
/*  64:    */     {
/*  65: 82 */       localdt = new dt(this);
/*  66: 83 */       if (this.o.p(localdt).c() == localatr)
/*  67:    */       {
/*  68: 84 */         this.o.g(localdt);
/*  69:    */       }
/*  70: 85 */       else if (!this.o.D)
/*  71:    */       {
/*  72: 86 */         J();
/*  73: 87 */         return;
/*  74:    */       }
/*  75:    */     }
/*  76: 91 */     this.w -= 0.03999999910593033D;
/*  77: 92 */     d(this.v, this.w, this.x);
/*  78: 93 */     this.v *= 0.9800000190734863D;
/*  79: 94 */     this.w *= 0.9800000190734863D;
/*  80: 95 */     this.x *= 0.9800000190734863D;
/*  81: 97 */     if (!this.o.D)
/*  82:    */     {
/*  83: 98 */       localdt = new dt(this);
/*  84:100 */       if (this.C)
/*  85:    */       {
/*  86:101 */         this.v *= 0.699999988079071D;
/*  87:102 */         this.x *= 0.699999988079071D;
/*  88:103 */         this.w *= -0.5D;
/*  89:105 */         if (this.o.p(localdt).c() != aty.M)
/*  90:    */         {
/*  91:106 */           J();
/*  92:108 */           if ((!this.e) && (this.o.a(localatr, localdt, true, ej.b, null, null)) && (!avt.d(this.o, localdt.b())) && (this.o.a(localdt, this.d, 3)))
/*  93:    */           {
/*  94:109 */             if ((localatr instanceof avt)) {
/*  95:110 */               ((avt)localatr).a_(this.o, localdt);
/*  96:    */             }
/*  97:112 */             if ((this.c != null) && ((localatr instanceof avs)))
/*  98:    */             {
/*  99:113 */               bcm localbcm = this.o.s(localdt);
/* 100:115 */               if (localbcm != null)
/* 101:    */               {
/* 102:116 */                 fn localfn = new fn();
/* 103:117 */                 localbcm.b(localfn);
/* 104:118 */                 for (String str : this.c.c())
/* 105:    */                 {
/* 106:119 */                   gd localgd = this.c.a(str);
/* 107:120 */                   if ((!str.equals("x")) && (!str.equals("y")) && (!str.equals("z"))) {
/* 108:123 */                     localfn.a(str, localgd.b());
/* 109:    */                   }
/* 110:    */                 }
/* 111:125 */                 localbcm.a(localfn);
/* 112:126 */                 localbcm.o_();
/* 113:    */               }
/* 114:    */             }
/* 115:    */           }
/* 116:130 */           else if ((this.b) && (!this.e) && (this.o.Q().b("doTileDrops")))
/* 117:    */           {
/* 118:131 */             a(new amj(localatr, 1, localatr.a(this.d)), 0.0F);
/* 119:    */           }
/* 120:    */         }
/* 121:    */       }
/* 122:135 */       else if (((this.a > 100) && (!this.o.D) && ((localdt.o() < 1) || (localdt.o() > 256))) || (this.a > 600))
/* 123:    */       {
/* 124:136 */         if ((this.b) && (this.o.Q().b("doTileDrops"))) {
/* 125:137 */           a(new amj(localatr, 1, localatr.a(this.d)), 0.0F);
/* 126:    */         }
/* 127:139 */         J();
/* 128:    */       }
/* 129:    */     }
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void e(float paramFloat1, float paramFloat2)
/* 133:    */   {
/* 134:146 */     atr localatr = this.d.c();
/* 135:147 */     if (this.f)
/* 136:    */     {
/* 137:148 */       int i = uv.f(paramFloat1 - 1.0F);
/* 138:149 */       if (i > 0)
/* 139:    */       {
/* 140:150 */         ArrayList localArrayList = Lists.newArrayList(this.o.b(this, aQ()));
/* 141:151 */         int j = localatr == aty.cf ? 1 : 0;
/* 142:152 */         wh localwh = j != 0 ? wh.n : wh.o;
/* 143:154 */         for (wv localwv : localArrayList) {
/* 144:155 */           localwv.a(localwh, Math.min(uv.d(i * this.h), this.g));
/* 145:    */         }
/* 146:158 */         if ((j != 0) && (this.V.nextFloat() < 0.0500000007450581D + i * 0.05D))
/* 147:    */         {
/* 148:159 */           int k = ((Integer)this.d.b(asz.b)).intValue();
/* 149:    */           
/* 150:161 */           k++;
/* 151:161 */           if (k > 2) {
/* 152:162 */             this.e = true;
/* 153:    */           } else {
/* 154:164 */             this.d = this.d.a(asz.b, Integer.valueOf(k));
/* 155:    */           }
/* 156:    */         }
/* 157:    */       }
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   protected void b(fn paramfn)
/* 162:    */   {
/* 163:173 */     atr localatr = this.d != null ? this.d.c() : aty.a;
/* 164:174 */     oa localoa = (oa)atr.c.c(localatr);
/* 165:175 */     paramfn.a("Block", localoa == null ? "" : localoa.toString());
/* 166:176 */     paramfn.a("Data", (byte)localatr.c(this.d));
/* 167:177 */     paramfn.a("Time", (byte)this.a);
/* 168:178 */     paramfn.a("DropItem", this.b);
/* 169:179 */     paramfn.a("HurtEntities", this.f);
/* 170:180 */     paramfn.a("FallHurtAmount", this.h);
/* 171:181 */     paramfn.a("FallHurtMax", this.g);
/* 172:182 */     if (this.c != null) {
/* 173:183 */       paramfn.a("TileEntityData", this.c);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   protected void a(fn paramfn)
/* 178:    */   {
/* 179:189 */     int i = paramfn.d("Data") & 0xFF;
/* 180:190 */     if (paramfn.b("Block", 8)) {
/* 181:191 */       this.d = atr.b(paramfn.j("Block")).a(i);
/* 182:192 */     } else if (paramfn.b("TileID", 99)) {
/* 183:193 */       this.d = atr.c(paramfn.f("TileID")).a(i);
/* 184:    */     } else {
/* 185:195 */       this.d = atr.c(paramfn.d("Tile") & 0xFF).a(i);
/* 186:    */     }
/* 187:198 */     this.a = (paramfn.d("Time") & 0xFF);
/* 188:    */     
/* 189:200 */     atr localatr = this.d.c();
/* 190:201 */     if (paramfn.b("HurtEntities", 99))
/* 191:    */     {
/* 192:202 */       this.f = paramfn.n("HurtEntities");
/* 193:203 */       this.h = paramfn.h("FallHurtAmount");
/* 194:204 */       this.g = paramfn.f("FallHurtMax");
/* 195:    */     }
/* 196:205 */     else if (localatr == aty.cf)
/* 197:    */     {
/* 198:206 */       this.f = true;
/* 199:    */     }
/* 200:209 */     if (paramfn.b("DropItem", 99)) {
/* 201:210 */       this.b = paramfn.n("DropItem");
/* 202:    */     }
/* 203:213 */     if (paramfn.b("TileEntityData", 10)) {
/* 204:214 */       this.c = paramfn.m("TileEntityData");
/* 205:    */     }
/* 206:217 */     if ((localatr == null) || (localatr.r() == bof.a)) {
/* 207:218 */       this.d = aty.m.P();
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public aqu j()
/* 212:    */   {
/* 213:223 */     return this.o;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void a(boolean paramBoolean)
/* 217:    */   {
/* 218:227 */     this.f = paramBoolean;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public boolean aI()
/* 222:    */   {
/* 223:232 */     return false;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void a(j paramj)
/* 227:    */   {
/* 228:237 */     super.a(paramj);
/* 229:238 */     if (this.d != null)
/* 230:    */     {
/* 231:239 */       atr localatr = this.d.c();
/* 232:240 */       paramj.a("Immitating block ID", Integer.valueOf(atr.a(localatr)));
/* 233:241 */       paramj.a("Immitating block data", Integer.valueOf(localatr.c(this.d)));
/* 234:    */     }
/* 235:    */   }
/* 236:    */   
/* 237:    */   public bec l()
/* 238:    */   {
/* 239:247 */     return this.d;
/* 240:    */   }
/* 241:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adv
 * JD-Core Version:    0.7.0.1
 */