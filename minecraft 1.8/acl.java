/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class acl
/*   6:    */   extends abq
/*   7:    */ {
/*   8: 37 */   private final ain bk = new ain(new acm(this), 2, 1);
/*   9: 44 */   private static final Map bm = Maps.newEnumMap(akv.class);
/*  10:    */   private int bn;
/*  11:    */   
/*  12:    */   static
/*  13:    */   {
/*  14: 46 */     bm.put(akv.a, new float[] { 1.0F, 1.0F, 1.0F });
/*  15: 47 */     bm.put(akv.b, new float[] { 0.85F, 0.5F, 0.2F });
/*  16: 48 */     bm.put(akv.c, new float[] { 0.7F, 0.3F, 0.85F });
/*  17: 49 */     bm.put(akv.d, new float[] { 0.4F, 0.6F, 0.85F });
/*  18: 50 */     bm.put(akv.e, new float[] { 0.9F, 0.9F, 0.2F });
/*  19: 51 */     bm.put(akv.f, new float[] { 0.5F, 0.8F, 0.1F });
/*  20: 52 */     bm.put(akv.g, new float[] { 0.95F, 0.5F, 0.65F });
/*  21: 53 */     bm.put(akv.h, new float[] { 0.3F, 0.3F, 0.3F });
/*  22: 54 */     bm.put(akv.i, new float[] { 0.6F, 0.6F, 0.6F });
/*  23: 55 */     bm.put(akv.j, new float[] { 0.3F, 0.5F, 0.6F });
/*  24: 56 */     bm.put(akv.k, new float[] { 0.5F, 0.25F, 0.7F });
/*  25: 57 */     bm.put(akv.l, new float[] { 0.2F, 0.3F, 0.7F });
/*  26: 58 */     bm.put(akv.m, new float[] { 0.4F, 0.3F, 0.2F });
/*  27: 59 */     bm.put(akv.n, new float[] { 0.4F, 0.5F, 0.2F });
/*  28: 60 */     bm.put(akv.o, new float[] { 0.6F, 0.2F, 0.2F });
/*  29: 61 */     bm.put(akv.p, new float[] { 0.1F, 0.1F, 0.1F });
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static float[] a(akv paramakv)
/*  33:    */   {
/*  34: 65 */     return (float[])bm.get(paramakv);
/*  35:    */   }
/*  36:    */   
/*  37: 69 */   private yw bo = new yw(this);
/*  38:    */   
/*  39:    */   public acl(aqu paramaqu)
/*  40:    */   {
/*  41: 72 */     super(paramaqu);
/*  42: 73 */     a(0.9F, 1.3F);
/*  43:    */     
/*  44: 75 */     ((aay)s()).a(true);
/*  45: 76 */     this.i.a(0, new yy(this));
/*  46: 77 */     this.i.a(1, new zu(this, 1.25D));
/*  47: 78 */     this.i.a(2, new yt(this, 1.0D));
/*  48: 79 */     this.i.a(3, new aag(this, 1.1D, amk.O, false));
/*  49: 80 */     this.i.a(4, new za(this, 1.1D));
/*  50: 81 */     this.i.a(5, this.bo);
/*  51: 82 */     this.i.a(6, new zy(this, 1.0D));
/*  52: 83 */     this.i.a(7, new zh(this, ahd.class, 6.0F));
/*  53: 84 */     this.i.a(8, new zx(this));
/*  54:    */     
/*  55: 86 */     this.bk.a(0, new amj(amk.aW, 1, 0));
/*  56: 87 */     this.bk.a(1, new amj(amk.aW, 1, 0));
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void E()
/*  60:    */   {
/*  61: 92 */     this.bn = this.bo.f();
/*  62: 93 */     super.E();
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void m()
/*  66:    */   {
/*  67: 98 */     if (this.o.D) {
/*  68: 99 */       this.bn = Math.max(0, this.bn - 1);
/*  69:    */     }
/*  70:101 */     super.m();
/*  71:    */   }
/*  72:    */   
/*  73:    */   protected void aW()
/*  74:    */   {
/*  75:106 */     super.aW();
/*  76:    */     
/*  77:108 */     a(afs.a).a(8.0D);
/*  78:109 */     a(afs.d).a(0.2300000041723251D);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected void h()
/*  82:    */   {
/*  83:114 */     super.h();
/*  84:    */     
/*  85:    */ 
/*  86:117 */     this.ac.a(16, new Byte((byte)0));
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected void b(boolean paramBoolean, int paramInt)
/*  90:    */   {
/*  91:122 */     if (!ck()) {
/*  92:124 */       a(new amj(alq.a(aty.L), 1, cj().a()), 0.0F);
/*  93:    */     }
/*  94:128 */     int i = this.V.nextInt(2) + 1 + this.V.nextInt(1 + paramInt);
/*  95:129 */     for (int j = 0; j < i; j++) {
/*  96:130 */       if (au()) {
/*  97:131 */         a(amk.bn, 1);
/*  98:    */       } else {
/*  99:133 */         a(amk.bm, 1);
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   protected alq A()
/* 105:    */   {
/* 106:140 */     return alq.a(aty.L);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void a(byte paramByte)
/* 110:    */   {
/* 111:145 */     if (paramByte == 10) {
/* 112:146 */       this.bn = 40;
/* 113:    */     } else {
/* 114:148 */       super.a(paramByte);
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public float o(float paramFloat)
/* 119:    */   {
/* 120:153 */     if (this.bn <= 0) {
/* 121:154 */       return 0.0F;
/* 122:    */     }
/* 123:156 */     if ((this.bn >= 4) && (this.bn <= 36)) {
/* 124:157 */       return 1.0F;
/* 125:    */     }
/* 126:159 */     if (this.bn < 4) {
/* 127:160 */       return (this.bn - paramFloat) / 4.0F;
/* 128:    */     }
/* 129:162 */     return -(this.bn - 40 - paramFloat) / 4.0F;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public float p(float paramFloat)
/* 133:    */   {
/* 134:166 */     if ((this.bn > 4) && (this.bn <= 36))
/* 135:    */     {
/* 136:167 */       float f = (this.bn - 4 - paramFloat) / 32.0F;
/* 137:168 */       return 0.6283186F + 0.2199115F * uv.a(f * 28.700001F);
/* 138:    */     }
/* 139:170 */     if (this.bn > 0) {
/* 140:171 */       return 0.6283186F;
/* 141:    */     }
/* 142:173 */     return this.z / 57.295776F;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean a(ahd paramahd)
/* 146:    */   {
/* 147:178 */     amj localamj = paramahd.bg.h();
/* 148:180 */     if ((localamj != null) && (localamj.b() == amk.be) && (!ck()) && (!i_()))
/* 149:    */     {
/* 150:181 */       if (!this.o.D)
/* 151:    */       {
/* 152:182 */         l(true);
/* 153:183 */         int i = 1 + this.V.nextInt(3);
/* 154:184 */         for (int j = 0; j < i; j++)
/* 155:    */         {
/* 156:185 */           adw localadw = a(new amj(alq.a(aty.L), 1, cj().a()), 1.0F);
/* 157:186 */           localadw.w += this.V.nextFloat() * 0.05F;
/* 158:187 */           localadw.v += (this.V.nextFloat() - this.V.nextFloat()) * 0.1F;
/* 159:188 */           localadw.x += (this.V.nextFloat() - this.V.nextFloat()) * 0.1F;
/* 160:    */         }
/* 161:    */       }
/* 162:191 */       localamj.a(1, paramahd);
/* 163:192 */       a("mob.sheep.shear", 1.0F, 1.0F);
/* 164:    */     }
/* 165:195 */     return super.a(paramahd);
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void b(fn paramfn)
/* 169:    */   {
/* 170:200 */     super.b(paramfn);
/* 171:201 */     paramfn.a("Sheared", ck());
/* 172:202 */     paramfn.a("Color", (byte)cj().a());
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(fn paramfn)
/* 176:    */   {
/* 177:207 */     super.a(paramfn);
/* 178:208 */     l(paramfn.n("Sheared"));
/* 179:209 */     b(akv.b(paramfn.d("Color")));
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected String z()
/* 183:    */   {
/* 184:214 */     return "mob.sheep.say";
/* 185:    */   }
/* 186:    */   
/* 187:    */   protected String bn()
/* 188:    */   {
/* 189:219 */     return "mob.sheep.say";
/* 190:    */   }
/* 191:    */   
/* 192:    */   protected String bo()
/* 193:    */   {
/* 194:224 */     return "mob.sheep.say";
/* 195:    */   }
/* 196:    */   
/* 197:    */   protected void a(dt paramdt, atr paramatr)
/* 198:    */   {
/* 199:229 */     a("mob.sheep.step", 0.15F, 1.0F);
/* 200:    */   }
/* 201:    */   
/* 202:    */   public akv cj()
/* 203:    */   {
/* 204:233 */     return akv.b(this.ac.a(16) & 0xF);
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void b(akv paramakv)
/* 208:    */   {
/* 209:237 */     int i = this.ac.a(16);
/* 210:238 */     this.ac.b(16, Byte.valueOf((byte)(i & 0xF0 | paramakv.a() & 0xF)));
/* 211:    */   }
/* 212:    */   
/* 213:    */   public boolean ck()
/* 214:    */   {
/* 215:242 */     return (this.ac.a(16) & 0x10) != 0;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void l(boolean paramBoolean)
/* 219:    */   {
/* 220:246 */     int i = this.ac.a(16);
/* 221:247 */     if (paramBoolean) {
/* 222:248 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x10)));
/* 223:    */     } else {
/* 224:250 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFEF)));
/* 225:    */     }
/* 226:    */   }
/* 227:    */   
/* 228:    */   public static akv a(Random paramRandom)
/* 229:    */   {
/* 230:255 */     int i = paramRandom.nextInt(100);
/* 231:256 */     if (i < 5) {
/* 232:257 */       return akv.p;
/* 233:    */     }
/* 234:259 */     if (i < 10) {
/* 235:260 */       return akv.h;
/* 236:    */     }
/* 237:262 */     if (i < 15) {
/* 238:263 */       return akv.i;
/* 239:    */     }
/* 240:265 */     if (i < 18) {
/* 241:266 */       return akv.m;
/* 242:    */     }
/* 243:268 */     if (paramRandom.nextInt(500) == 0) {
/* 244:269 */       return akv.g;
/* 245:    */     }
/* 246:271 */     return akv.a;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public acl b(ws paramws)
/* 250:    */   {
/* 251:276 */     acl localacl1 = (acl)paramws;
/* 252:277 */     acl localacl2 = new acl(this.o);
/* 253:    */     
/* 254:279 */     localacl2.b(a(this, localacl1));
/* 255:    */     
/* 256:281 */     return localacl2;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void v()
/* 260:    */   {
/* 261:286 */     l(false);
/* 262:287 */     if (i_()) {
/* 263:289 */       a(60);
/* 264:    */     }
/* 265:    */   }
/* 266:    */   
/* 267:    */   public xq a(vu paramvu, xq paramxq)
/* 268:    */   {
/* 269:296 */     paramxq = super.a(paramvu, paramxq);
/* 270:    */     
/* 271:298 */     b(a(this.o.s));
/* 272:299 */     return paramxq;
/* 273:    */   }
/* 274:    */   
/* 275:    */   private akv a(abq paramabq1, abq paramabq2)
/* 276:    */   {
/* 277:303 */     int i = ((acl)paramabq1).cj().b();
/* 278:304 */     int j = ((acl)paramabq2).cj().b();
/* 279:    */     
/* 280:306 */     this.bk.a(0).b(i);
/* 281:307 */     this.bk.a(1).b(j);
/* 282:    */     
/* 283:309 */     amj localamj = aop.a().a(this.bk, ((acl)paramabq1).o);
/* 284:    */     int k;
/* 285:312 */     if ((localamj != null) && (localamj.b() == amk.aW)) {
/* 286:313 */       k = localamj.i();
/* 287:    */     } else {
/* 288:315 */       k = this.o.s.nextBoolean() ? i : j;
/* 289:    */     }
/* 290:317 */     return akv.a(k);
/* 291:    */   }
/* 292:    */   
/* 293:    */   public float aR()
/* 294:    */   {
/* 295:322 */     return 0.95F * this.K;
/* 296:    */   }
/* 297:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     acl
 * JD-Core Version:    0.7.0.1
 */