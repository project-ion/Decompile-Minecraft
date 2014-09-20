/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Map.Entry;
/*   4:    */ 
/*   5:    */ public class clc
/*   6:    */ {
/*   7: 27 */   private final Map a = Maps.newIdentityHashMap();
/*   8: 28 */   private final cnd b = new cnd();
/*   9:    */   private final cxk c;
/*  10:    */   
/*  11:    */   public clc(cxk paramcxk)
/*  12:    */   {
/*  13: 32 */     this.c = paramcxk;
/*  14:    */     
/*  15: 34 */     d();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public cnd a()
/*  19:    */   {
/*  20: 38 */     return this.b;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public cue a(bec parambec)
/*  24:    */   {
/*  25: 42 */     atr localatr = parambec.c();
/*  26: 43 */     cxe localcxe = b(parambec);
/*  27: 44 */     if ((localcxe == null) || (localcxe == this.c.a()))
/*  28:    */     {
/*  29: 47 */       if ((localatr == aty.ax) || (localatr == aty.an) || (localatr == aty.ae) || (localatr == aty.cg) || (localatr == aty.cK) || (localatr == aty.cL)) {
/*  30: 48 */         return this.c.b().a("minecraft:blocks/planks_oak");
/*  31:    */       }
/*  32: 49 */       if (localatr == aty.bQ) {
/*  33: 50 */         return this.c.b().a("minecraft:blocks/obsidian");
/*  34:    */       }
/*  35: 51 */       if ((localatr == aty.k) || (localatr == aty.l)) {
/*  36: 52 */         return this.c.b().a("minecraft:blocks/lava_still");
/*  37:    */       }
/*  38: 53 */       if ((localatr == aty.i) || (localatr == aty.j)) {
/*  39: 54 */         return this.c.b().a("minecraft:blocks/water_still");
/*  40:    */       }
/*  41: 55 */       if (localatr == aty.ce) {
/*  42: 56 */         return this.c.b().a("minecraft:blocks/soul_sand");
/*  43:    */       }
/*  44: 57 */       if (localatr == aty.cv) {
/*  45: 58 */         return this.c.b().a("minecraft:items/barrier");
/*  46:    */       }
/*  47:    */     }
/*  48: 61 */     if (localcxe == null) {
/*  49: 62 */       localcxe = this.c.a();
/*  50:    */     }
/*  51: 64 */     return localcxe.e();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public cxe b(bec parambec)
/*  55:    */   {
/*  56: 68 */     cxe localcxe = (cxe)this.a.get(parambec);
/*  57: 69 */     if (localcxe == null) {
/*  58: 70 */       localcxe = this.c.a();
/*  59:    */     }
/*  60: 73 */     return localcxe;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public cxk b()
/*  64:    */   {
/*  65: 77 */     return this.c;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void c()
/*  69:    */   {
/*  70: 81 */     this.a.clear();
/*  71: 82 */     for (Map.Entry localEntry : this.b.a().entrySet()) {
/*  72: 83 */       this.a.put(localEntry.getKey(), this.c.a((cxl)localEntry.getValue()));
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(atr paramatr, cni paramcni)
/*  77:    */   {
/*  78: 88 */     this.b.a(paramatr, paramcni);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(atr... paramVarArgs)
/*  82:    */   {
/*  83: 92 */     this.b.a(paramVarArgs);
/*  84:    */   }
/*  85:    */   
/*  86:    */   private void d()
/*  87:    */   {
/*  88: 96 */     a(new atr[] { aty.a, aty.i, aty.j, aty.k, aty.l, aty.M, aty.ae, aty.bQ, aty.cg, aty.an, aty.ce, aty.bF, aty.cv, aty.ax, aty.cL, aty.cK });
/*  89:    */     
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:115 */     a(aty.b, new cnh().a(bba.a).a());
/* 108:116 */     a(aty.cI, new cnh().a(azi.a).a());
/* 109:117 */     a(aty.t, new cnh().a(ayp.P).a("_leaves").a(new bex[] { axg.b, axg.a }).a());
/* 110:118 */     a(aty.u, new cnh().a(ayg.P).a("_leaves").a(new bex[] { axg.b, axg.a }).a());
/* 111:119 */     a(aty.aK, new cnh().a(new bex[] { auf.a }).a());
/* 112:120 */     a(aty.aM, new cnh().a(new bex[] { azy.a }).a());
/* 113:121 */     a(aty.aN, new cnh().a(new bex[] { axc.a }).a());
/* 114:122 */     a(aty.bX, new cnh().a(new bex[] { auo.a }).a());
/* 115:123 */     a(aty.bZ, new cnh().a(bbx.P).a("_wall").a());
/* 116:124 */     a(aty.cF, new cnh().a(avi.a).a());
/* 117:125 */     a(aty.bo, new cnh().a(new bex[] { avw.b }).a());
/* 118:126 */     a(aty.bp, new cnh().a(new bex[] { avw.b }).a());
/* 119:127 */     a(aty.bq, new cnh().a(new bex[] { avw.b }).a());
/* 120:128 */     a(aty.br, new cnh().a(new bex[] { avw.b }).a());
/* 121:129 */     a(aty.bs, new cnh().a(new bex[] { avw.b }).a());
/* 122:130 */     a(aty.bt, new cnh().a(new bex[] { avw.b }).a());
/* 123:131 */     a(aty.bS, new cnh().a(new bex[] { bbs.N, bbs.a }).a());
/* 124:132 */     a(aty.bL, new cnh().a(ayw.a).a("_double_slab").a());
/* 125:133 */     a(aty.bM, new cnh().a(ayw.a).a("_slab").a());
/* 126:134 */     a(aty.W, new cnh().a(new bex[] { bbk.a }).a());
/* 127:135 */     a(aty.ab, new cnh().a(new bex[] { avx.a }).a());
/* 128:136 */     a(aty.af, new cnh().a(new bex[] { azt.O }).a());
/* 129:137 */     a(aty.ao, new cnh().a(new bex[] { avf.N }).a());
/* 130:138 */     a(aty.ap, new cnh().a(new bex[] { avf.N }).a());
/* 131:139 */     a(aty.aq, new cnh().a(new bex[] { avf.N }).a());
/* 132:140 */     a(aty.ar, new cnh().a(new bex[] { avf.N }).a());
/* 133:141 */     a(aty.as, new cnh().a(new bex[] { avf.N }).a());
/* 134:142 */     a(aty.at, new cnh().a(new bex[] { avf.N }).a());
/* 135:143 */     a(aty.aA, new cnh().a(new bex[] { avf.N }).a());
/* 136:144 */     a(aty.L, new cnh().a(aun.a).a("_wool").a());
/* 137:145 */     a(aty.cy, new cnh().a(aun.a).a("_carpet").a());
/* 138:146 */     a(aty.cu, new cnh().a(aun.a).a("_stained_hardened_clay").a());
/* 139:147 */     a(aty.cH, new cnh().a(aun.a).a("_stained_glass_pane").a());
/* 140:148 */     a(aty.cG, new cnh().a(aun.a).a("_stained_glass").a());
/* 141:149 */     a(aty.A, new cnh().a(bad.a).a());
/* 142:150 */     a(aty.cM, new cnh().a(azq.a).a());
/* 143:151 */     a(aty.H, new cnh().a(bbh.a).a());
/* 144:152 */     a(aty.C, new cnh().a(new bex[] { atp.b }).a());
/* 145:153 */     a(aty.N, new cnh().a(aty.N.l()).a());
/* 146:154 */     a(aty.O, new cnh().a(aty.O.l()).a());
/* 147:155 */     a(aty.U, new cnh().a(bbf.M).a("_slab").a());
/* 148:156 */     a(aty.cP, new cnh().a(ayl.M).a("_slab").a());
/* 149:157 */     a(aty.be, new cnh().a(axs.a).a("_monster_egg").a());
/* 150:158 */     a(aty.bf, new cnh().a(bbc.a).a());
/* 151:159 */     a(aty.z, new cnh().a(new bex[] { ave.b }).a());
/* 152:160 */     a(aty.ct, new cnh().a(new bex[] { avm.b }).a());
/* 153:161 */     a(aty.r, new cnh().a(ayr.b).a("_log").a());
/* 154:162 */     a(aty.s, new cnh().a(ayi.b).a("_log").a());
/* 155:163 */     a(aty.f, new cnh().a(ayw.a).a("_planks").a());
/* 156:164 */     a(aty.g, new cnh().a(baf.a).a("_sapling").a());
/* 157:165 */     a(aty.m, new cnh().a(bab.a).a());
/* 158:166 */     a(aty.cp, new cnh().a(new bex[] { awx.b }).a());
/* 159:167 */     a(aty.ca, new cnh().a(new bex[] { awd.a }).a());
/* 160:    */     
/* 161:169 */     a(aty.cq, new cld(this));
/* 162:    */     
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:189 */     a(aty.I, new cle(this));
/* 182:    */     
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:    */ 
/* 188:196 */     a(aty.bl, new clf(this));
/* 189:    */     
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:208 */     a(aty.bm, new clg(this));
/* 201:    */     
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:    */ 
/* 207:    */ 
/* 208:    */ 
/* 209:    */ 
/* 210:    */ 
/* 211:    */ 
/* 212:220 */     a(aty.d, new clh(this));
/* 213:    */     
/* 214:    */ 
/* 215:    */ 
/* 216:    */ 
/* 217:    */ 
/* 218:    */ 
/* 219:    */ 
/* 220:    */ 
/* 221:    */ 
/* 222:    */ 
/* 223:    */ 
/* 224:    */ 
/* 225:    */ 
/* 226:234 */     a(aty.T, new cli(this));
/* 227:    */     
/* 228:    */ 
/* 229:    */ 
/* 230:    */ 
/* 231:    */ 
/* 232:    */ 
/* 233:    */ 
/* 234:    */ 
/* 235:    */ 
/* 236:    */ 
/* 237:    */ 
/* 238:    */ 
/* 239:247 */     a(aty.cO, new clj(this));
/* 240:    */   }
/* 241:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     clc
 * JD-Core Version:    0.7.0.1
 */