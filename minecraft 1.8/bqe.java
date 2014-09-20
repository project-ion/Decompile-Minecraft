/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ 
/*   6:    */ public class bqe
/*   7:    */   extends bqc
/*   8:    */ {
/*   9:    */   public int b;
/*  10:    */   public int c;
/*  11:    */   public byte d;
/*  12:    */   public byte e;
/*  13: 74 */   public byte[] f = new byte[16384];
/*  14: 75 */   public List g = Lists.newArrayList();
/*  15: 76 */   private Map i = Maps.newHashMap();
/*  16: 77 */   public Map h = Maps.newLinkedHashMap();
/*  17:    */   
/*  18:    */   public bqe(String paramString)
/*  19:    */   {
/*  20: 80 */     super(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(double paramDouble1, double paramDouble2, int paramInt)
/*  24:    */   {
/*  25: 84 */     int j = 128 * (1 << paramInt);
/*  26:    */     
/*  27: 86 */     int k = uv.c((paramDouble1 + 64.0D) / j);
/*  28: 87 */     int m = uv.c((paramDouble2 + 64.0D) / j);
/*  29:    */     
/*  30: 89 */     this.b = (k * j + j / 2 - 64);
/*  31: 90 */     this.c = (m * j + j / 2 - 64);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(fn paramfn)
/*  35:    */   {
/*  36: 95 */     this.d = paramfn.d("dimension");
/*  37: 96 */     this.b = paramfn.f("xCenter");
/*  38: 97 */     this.c = paramfn.f("zCenter");
/*  39: 98 */     this.e = paramfn.d("scale");
/*  40: 99 */     this.e = ((byte)uv.a(this.e, 0, 4));
/*  41:    */     
/*  42:101 */     int j = paramfn.e("width");
/*  43:102 */     int k = paramfn.e("height");
/*  44:103 */     if ((j == 128) && (k == 128))
/*  45:    */     {
/*  46:104 */       this.f = paramfn.k("colors");
/*  47:    */     }
/*  48:    */     else
/*  49:    */     {
/*  50:106 */       byte[] arrayOfByte = paramfn.k("colors");
/*  51:107 */       this.f = new byte[16384];
/*  52:108 */       int m = (128 - j) / 2;
/*  53:109 */       int n = (128 - k) / 2;
/*  54:110 */       for (int i1 = 0; i1 < k; i1++)
/*  55:    */       {
/*  56:111 */         int i2 = i1 + n;
/*  57:112 */         if ((i2 >= 0) || (i2 < 128)) {
/*  58:115 */           for (int i3 = 0; i3 < j; i3++)
/*  59:    */           {
/*  60:116 */             int i4 = i3 + m;
/*  61:117 */             if ((i4 >= 0) || (i4 < 128)) {
/*  62:120 */               this.f[(i4 + i2 * 128)] = arrayOfByte[(i3 + i1 * j)];
/*  63:    */             }
/*  64:    */           }
/*  65:    */         }
/*  66:    */       }
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void b(fn paramfn)
/*  71:    */   {
/*  72:128 */     paramfn.a("dimension", this.d);
/*  73:129 */     paramfn.a("xCenter", this.b);
/*  74:130 */     paramfn.a("zCenter", this.c);
/*  75:131 */     paramfn.a("scale", this.e);
/*  76:132 */     paramfn.a("width", (short)128);
/*  77:133 */     paramfn.a("height", (short)128);
/*  78:134 */     paramfn.a("colors", this.f);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(ahd paramahd, amj paramamj)
/*  82:    */   {
/*  83:138 */     if (!this.i.containsKey(paramahd))
/*  84:    */     {
/*  85:139 */       bqf localbqf = new bqf(this, paramahd);
/*  86:140 */       this.i.put(paramahd, localbqf);
/*  87:141 */       this.g.add(localbqf);
/*  88:    */     }
/*  89:144 */     if (!paramahd.bg.c(paramamj)) {
/*  90:145 */       this.h.remove(paramahd.d_());
/*  91:    */     }
/*  92:    */     Object localObject2;
/*  93:148 */     for (int j = 0; j < this.g.size(); j++)
/*  94:    */     {
/*  95:149 */       localObject2 = (bqf)this.g.get(j);
/*  96:151 */       if ((((bqf)localObject2).a.I) || ((!((bqf)localObject2).a.bg.c(paramamj)) && (!paramamj.y())))
/*  97:    */       {
/*  98:152 */         this.i.remove(((bqf)localObject2).a);
/*  99:153 */         this.g.remove(localObject2);
/* 100:    */       }
/* 101:154 */       else if ((!paramamj.y()) && (((bqf)localObject2).a.am == this.d))
/* 102:    */       {
/* 103:155 */         a(0, ((bqf)localObject2).a.o, ((bqf)localObject2).a.d_(), ((bqf)localObject2).a.s, ((bqf)localObject2).a.u, ((bqf)localObject2).a.y);
/* 104:    */       }
/* 105:    */     }
/* 106:    */     Object localObject1;
/* 107:159 */     if (paramamj.y())
/* 108:    */     {
/* 109:160 */       localObject1 = paramamj.z();
/* 110:161 */       localObject2 = ((adk)localObject1).n();
/* 111:162 */       a(1, paramahd.o, "frame-" + ((adk)localObject1).F(), ((dt)localObject2).n(), ((dt)localObject2).p(), ((adk)localObject1).b.b() * 90);
/* 112:    */     }
/* 113:165 */     if ((paramamj.n()) && (paramamj.o().b("Decorations", 9)))
/* 114:    */     {
/* 115:166 */       localObject1 = paramamj.o().c("Decorations", 10);
/* 116:167 */       for (int k = 0; k < ((fv)localObject1).c(); k++)
/* 117:    */       {
/* 118:168 */         fn localfn = ((fv)localObject1).b(k);
/* 119:169 */         if (!this.h.containsKey(localfn.j("id"))) {
/* 120:170 */           a(localfn.d("type"), paramahd.o, localfn.j("id"), localfn.i("x"), localfn.i("z"), localfn.i("rot"));
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   private void a(int paramInt, aqu paramaqu, String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
/* 127:    */   {
/* 128:177 */     int j = 1 << this.e;
/* 129:178 */     float f1 = (float)(paramDouble1 - this.b) / j;
/* 130:179 */     float f2 = (float)(paramDouble2 - this.c) / j;
/* 131:180 */     byte b1 = (byte)(int)(f1 * 2.0F + 0.5D);
/* 132:181 */     byte b2 = (byte)(int)(f2 * 2.0F + 0.5D);
/* 133:    */     
/* 134:183 */     int k = 63;
/* 135:    */     byte b3;
/* 136:185 */     if ((f1 >= -k) && (f2 >= -k) && (f1 <= k) && (f2 <= k))
/* 137:    */     {
/* 138:186 */       paramDouble3 += (paramDouble3 < 0.0D ? -8.0D : 8.0D);
/* 139:187 */       b3 = (byte)(int)(paramDouble3 * 16.0D / 360.0D);
/* 140:189 */       if (this.d < 0)
/* 141:    */       {
/* 142:190 */         int m = (int)(paramaqu.P().g() / 10L);
/* 143:191 */         b3 = (byte)(m * m * 34187121 + m * 121 >> 15 & 0xF);
/* 144:    */       }
/* 145:    */     }
/* 146:193 */     else if ((Math.abs(f1) < 320.0F) && (Math.abs(f2) < 320.0F))
/* 147:    */     {
/* 148:194 */       paramInt = 6;
/* 149:195 */       b3 = 0;
/* 150:196 */       if (f1 <= -k) {
/* 151:197 */         b1 = (byte)(int)(k * 2 + 2.5D);
/* 152:    */       }
/* 153:199 */       if (f2 <= -k) {
/* 154:200 */         b2 = (byte)(int)(k * 2 + 2.5D);
/* 155:    */       }
/* 156:202 */       if (f1 >= k) {
/* 157:203 */         b1 = (byte)(k * 2 + 1);
/* 158:    */       }
/* 159:205 */       if (f2 >= k) {
/* 160:206 */         b2 = (byte)(k * 2 + 1);
/* 161:    */       }
/* 162:    */     }
/* 163:    */     else
/* 164:    */     {
/* 165:209 */       this.h.remove(paramString);
/* 166:210 */       return;
/* 167:    */     }
/* 168:213 */     this.h.put(paramString, new bqd((byte)paramInt, b1, b2, b3));
/* 169:    */   }
/* 170:    */   
/* 171:    */   public id a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 172:    */   {
/* 173:218 */     bqf localbqf = (bqf)this.i.get(paramahd);
/* 174:220 */     if (localbqf == null) {
/* 175:221 */       return null;
/* 176:    */     }
/* 177:224 */     return localbqf.a(paramamj);
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void a(int paramInt1, int paramInt2)
/* 181:    */   {
/* 182:228 */     super.c();
/* 183:229 */     for (bqf localbqf : this.g) {
/* 184:230 */       localbqf.a(paramInt1, paramInt2);
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   public bqf a(ahd paramahd)
/* 189:    */   {
/* 190:235 */     bqf localbqf = (bqf)this.i.get(paramahd);
/* 191:237 */     if (localbqf == null)
/* 192:    */     {
/* 193:238 */       localbqf = new bqf(this, paramahd);
/* 194:239 */       this.i.put(paramahd, localbqf);
/* 195:240 */       this.g.add(localbqf);
/* 196:    */     }
/* 197:243 */     return localbqf;
/* 198:    */   }
/* 199:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bqe
 * JD-Core Version:    0.7.0.1
 */