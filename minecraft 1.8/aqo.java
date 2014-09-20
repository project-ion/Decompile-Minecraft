/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import java.util.HashSet;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ import java.util.Random;
/*   9:    */ import java.util.Set;
/*  10:    */ 
/*  11:    */ public class aqo
/*  12:    */ {
/*  13:    */   private final boolean a;
/*  14:    */   private final boolean b;
/*  15: 30 */   private final Random c = new Random();
/*  16:    */   private final aqu d;
/*  17:    */   private final double e;
/*  18:    */   private final double f;
/*  19:    */   private final double g;
/*  20:    */   private final wv h;
/*  21:    */   private final float i;
/*  22: 36 */   private final List j = Lists.newArrayList();
/*  23: 37 */   private final Map k = Maps.newHashMap();
/*  24:    */   
/*  25:    */   public aqo(aqu paramaqu, wv paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, List paramList)
/*  26:    */   {
/*  27: 44 */     this(paramaqu, paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, false, true, paramList);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public aqo(aqu paramaqu, wv paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, List paramList)
/*  31:    */   {
/*  32: 48 */     this(paramaqu, paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramBoolean1, paramBoolean2);
/*  33: 49 */     this.j.addAll(paramList);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public aqo(aqu paramaqu, wv paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
/*  37:    */   {
/*  38: 53 */     this.d = paramaqu;
/*  39: 54 */     this.h = paramwv;
/*  40: 55 */     this.i = paramFloat;
/*  41: 56 */     this.e = paramDouble1;
/*  42: 57 */     this.f = paramDouble2;
/*  43: 58 */     this.g = paramDouble3;
/*  44: 59 */     this.a = paramBoolean1;
/*  45: 60 */     this.b = paramBoolean2;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a()
/*  49:    */   {
/*  50: 64 */     HashSet localHashSet = Sets.newHashSet();
/*  51:    */     
/*  52: 66 */     int m = 16;
/*  53: 67 */     for (int n = 0; n < 16; n++) {
/*  54: 68 */       for (i1 = 0; i1 < 16; i1++) {
/*  55: 69 */         for (i2 = 0; i2 < 16; i2++) {
/*  56: 70 */           if ((n == 0) || (n == 15) || (i1 == 0) || (i1 == 15) || (i2 == 0) || (i2 == 15))
/*  57:    */           {
/*  58: 74 */             double d1 = n / 15.0F * 2.0F - 1.0F;
/*  59: 75 */             double d2 = i1 / 15.0F * 2.0F - 1.0F;
/*  60: 76 */             double d3 = i2 / 15.0F * 2.0F - 1.0F;
/*  61: 77 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*  62:    */             
/*  63: 79 */             d1 /= d4;
/*  64: 80 */             d2 /= d4;
/*  65: 81 */             d3 /= d4;
/*  66:    */             
/*  67: 83 */             float f2 = this.i * (0.7F + this.d.s.nextFloat() * 0.6F);
/*  68: 84 */             double d6 = this.e;
/*  69: 85 */             double d8 = this.f;
/*  70: 86 */             double d10 = this.g;
/*  71:    */             
/*  72: 88 */             float f3 = 0.3F;
/*  73: 89 */             while (f2 > 0.0F)
/*  74:    */             {
/*  75: 90 */               dt localdt = new dt(d6, d8, d10);
/*  76: 91 */               bec localbec = this.d.p(localdt);
/*  77: 93 */               if (localbec.c().r() != bof.a)
/*  78:    */               {
/*  79: 94 */                 float f4 = this.h != null ? this.h.a(this, this.d, localdt, localbec) : localbec.c().a(null);
/*  80: 95 */                 f2 -= (f4 + 0.3F) * 0.3F;
/*  81:    */               }
/*  82: 98 */               if ((f2 > 0.0F) && ((this.h == null) || (this.h.a(this, this.d, localdt, localbec, f2)))) {
/*  83: 99 */                 localHashSet.add(localdt);
/*  84:    */               }
/*  85:102 */               d6 += d1 * 0.300000011920929D;
/*  86:103 */               d8 += d2 * 0.300000011920929D;
/*  87:104 */               d10 += d3 * 0.300000011920929D;
/*  88:105 */               f2 -= 0.225F;
/*  89:    */             }
/*  90:    */           }
/*  91:    */         }
/*  92:    */       }
/*  93:    */     }
/*  94:111 */     this.j.addAll(localHashSet);
/*  95:    */     
/*  96:113 */     float f1 = this.i * 2.0F;
/*  97:    */     
/*  98:115 */     int i1 = uv.c(this.e - f1 - 1.0D);
/*  99:116 */     int i2 = uv.c(this.e + f1 + 1.0D);
/* 100:117 */     int i3 = uv.c(this.f - f1 - 1.0D);
/* 101:118 */     int i4 = uv.c(this.f + f1 + 1.0D);
/* 102:119 */     int i5 = uv.c(this.g - f1 - 1.0D);
/* 103:120 */     int i6 = uv.c(this.g + f1 + 1.0D);
/* 104:121 */     List localList = this.d.b(this.h, new brt(i1, i3, i5, i2, i4, i6));
/* 105:122 */     brw localbrw = new brw(this.e, this.f, this.g);
/* 106:124 */     for (int i7 = 0; i7 < localList.size(); i7++)
/* 107:    */     {
/* 108:125 */       wv localwv = (wv)localList.get(i7);
/* 109:126 */       if (!localwv.aV())
/* 110:    */       {
/* 111:129 */         double d5 = localwv.f(this.e, this.f, this.g) / f1;
/* 112:131 */         if (d5 <= 1.0D)
/* 113:    */         {
/* 114:132 */           double d7 = localwv.s - this.e;
/* 115:133 */           double d9 = localwv.t + localwv.aR() - this.f;
/* 116:134 */           double d11 = localwv.u - this.g;
/* 117:    */           
/* 118:136 */           double d12 = uv.a(d7 * d7 + d9 * d9 + d11 * d11);
/* 119:137 */           if (d12 != 0.0D)
/* 120:    */           {
/* 121:141 */             d7 /= d12;
/* 122:142 */             d9 /= d12;
/* 123:143 */             d11 /= d12;
/* 124:    */             
/* 125:145 */             double d13 = this.d.a(localbrw, localwv.aQ());
/* 126:146 */             double d14 = (1.0D - d5) * d13;
/* 127:147 */             localwv.a(wh.a(this), (int)((d14 * d14 + d14) / 2.0D * 8.0D * f1 + 1.0D));
/* 128:    */             
/* 129:149 */             double d15 = apu.a(localwv, d14);
/* 130:150 */             localwv.v += d7 * d15;
/* 131:151 */             localwv.w += d9 * d15;
/* 132:152 */             localwv.x += d11 * d15;
/* 133:154 */             if ((localwv instanceof ahd)) {
/* 134:155 */               this.k.put((ahd)localwv, new brw(d7 * d14, d9 * d14, d11 * d14));
/* 135:    */             }
/* 136:    */           }
/* 137:    */         }
/* 138:    */       }
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void a(boolean paramBoolean)
/* 143:    */   {
/* 144:162 */     this.d.a(this.e, this.f, this.g, "random.explode", 4.0F, (1.0F + (this.d.s.nextFloat() - this.d.s.nextFloat()) * 0.2F) * 0.7F);
/* 145:163 */     if ((this.i < 2.0F) || (!this.b)) {
/* 146:164 */       this.d.a(ew.b, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
/* 147:    */     } else {
/* 148:166 */       this.d.a(ew.c, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
/* 149:    */     }
/* 150:    */     Iterator localIterator;
/* 151:169 */     if (this.b) {
/* 152:170 */       for (localIterator = this.j.iterator(); localIterator.hasNext();)
/* 153:    */       {
/* 154:170 */         localdt = (dt)localIterator.next();
/* 155:171 */         atr localatr = this.d.p(localdt).c();
/* 156:173 */         if (paramBoolean)
/* 157:    */         {
/* 158:174 */           double d1 = localdt.n() + this.d.s.nextFloat();
/* 159:175 */           double d2 = localdt.o() + this.d.s.nextFloat();
/* 160:176 */           double d3 = localdt.p() + this.d.s.nextFloat();
/* 161:    */           
/* 162:178 */           double d4 = d1 - this.e;
/* 163:179 */           double d5 = d2 - this.f;
/* 164:180 */           double d6 = d3 - this.g;
/* 165:    */           
/* 166:182 */           double d7 = uv.a(d4 * d4 + d5 * d5 + d6 * d6);
/* 167:    */           
/* 168:184 */           d4 /= d7;
/* 169:185 */           d5 /= d7;
/* 170:186 */           d6 /= d7;
/* 171:    */           
/* 172:188 */           double d8 = 0.5D / (d7 / this.i + 0.1D);
/* 173:189 */           d8 *= (this.d.s.nextFloat() * this.d.s.nextFloat() + 0.3F);
/* 174:190 */           d4 *= d8;
/* 175:191 */           d5 *= d8;
/* 176:192 */           d6 *= d8;
/* 177:    */           
/* 178:194 */           this.d.a(ew.a, (d1 + this.e * 1.0D) / 2.0D, (d2 + this.f * 1.0D) / 2.0D, (d3 + this.g * 1.0D) / 2.0D, d4, d5, d6, new int[0]);
/* 179:195 */           this.d.a(ew.l, d1, d2, d3, d4, d5, d6, new int[0]);
/* 180:    */         }
/* 181:198 */         if (localatr.r() != bof.a)
/* 182:    */         {
/* 183:199 */           if (localatr.a(this)) {
/* 184:200 */             localatr.a(this.d, localdt, this.d.p(localdt), 1.0F / this.i, 0);
/* 185:    */           }
/* 186:202 */           this.d.a(localdt, aty.a.P(), 3);
/* 187:203 */           localatr.a(this.d, localdt, this);
/* 188:    */         }
/* 189:    */       }
/* 190:    */     }
/* 191:    */     dt localdt;
/* 192:207 */     if (this.a) {
/* 193:208 */       for (localIterator = this.j.iterator(); localIterator.hasNext();)
/* 194:    */       {
/* 195:208 */         localdt = (dt)localIterator.next();
/* 196:209 */         if ((this.d.p(localdt).c().r() == bof.a) && (this.d.p(localdt.b()).c().m()) && (this.c.nextInt(3) == 0)) {
/* 197:210 */           this.d.a(localdt, aty.ab.P());
/* 198:    */         }
/* 199:    */       }
/* 200:    */     }
/* 201:    */   }
/* 202:    */   
/* 203:    */   public Map b()
/* 204:    */   {
/* 205:217 */     return this.k;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public xm c()
/* 209:    */   {
/* 210:221 */     if (this.h == null) {
/* 211:222 */       return null;
/* 212:    */     }
/* 213:224 */     if ((this.h instanceof aek)) {
/* 214:225 */       return ((aek)this.h).j();
/* 215:    */     }
/* 216:227 */     if ((this.h instanceof xm)) {
/* 217:228 */       return (xm)this.h;
/* 218:    */     }
/* 219:230 */     return null;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void d()
/* 223:    */   {
/* 224:234 */     this.j.clear();
/* 225:    */   }
/* 226:    */   
/* 227:    */   public List e()
/* 228:    */   {
/* 229:238 */     return this.j;
/* 230:    */   }
/* 231:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqo
 * JD-Core Version:    0.7.0.1
 */