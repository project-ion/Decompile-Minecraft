/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnm
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   public bnm() {}
/*    8:     */   
/*    9:     */   public bnm(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   10:     */   {
/*   11:1321 */     super(parambnk, paramInt);
/*   12:     */     
/*   13:1323 */     this.m = paramej;
/*   14:1324 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public static bnm a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   18:     */   {
/*   19:1328 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 7, 12, paramej);
/*   20:1330 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   21:1331 */       return null;
/*   22:     */     }
/*   23:1334 */     return new bnm(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   24:     */   }
/*   25:     */   
/*   26:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   27:     */   {
/*   28:1339 */     if (this.h < 0)
/*   29:     */     {
/*   30:1340 */       this.h = b(paramaqu, parambjb);
/*   31:1341 */       if (this.h < 0) {
/*   32:1342 */         return true;
/*   33:     */       }
/*   34:1344 */       this.l.a(0, this.h - this.l.e + 7 - 1, 0);
/*   35:     */     }
/*   36:1348 */     a(paramaqu, parambjb, 1, 1, 1, 7, 4, 4, aty.a.P(), aty.a.P(), false);
/*   37:1349 */     a(paramaqu, parambjb, 2, 1, 6, 8, 4, 10, aty.a.P(), aty.a.P(), false);
/*   38:     */     
/*   39:     */ 
/*   40:1352 */     a(paramaqu, parambjb, 2, 0, 5, 8, 0, 10, aty.f.P(), aty.f.P(), false);
/*   41:1353 */     a(paramaqu, parambjb, 1, 0, 1, 7, 0, 4, aty.f.P(), aty.f.P(), false);
/*   42:1354 */     a(paramaqu, parambjb, 0, 0, 0, 0, 3, 5, aty.e.P(), aty.e.P(), false);
/*   43:1355 */     a(paramaqu, parambjb, 8, 0, 0, 8, 3, 10, aty.e.P(), aty.e.P(), false);
/*   44:1356 */     a(paramaqu, parambjb, 1, 0, 0, 7, 2, 0, aty.e.P(), aty.e.P(), false);
/*   45:1357 */     a(paramaqu, parambjb, 1, 0, 5, 2, 1, 5, aty.e.P(), aty.e.P(), false);
/*   46:1358 */     a(paramaqu, parambjb, 2, 0, 6, 2, 3, 10, aty.e.P(), aty.e.P(), false);
/*   47:1359 */     a(paramaqu, parambjb, 3, 0, 10, 7, 3, 10, aty.e.P(), aty.e.P(), false);
/*   48:     */     
/*   49:     */ 
/*   50:1362 */     a(paramaqu, parambjb, 1, 2, 0, 7, 3, 0, aty.f.P(), aty.f.P(), false);
/*   51:1363 */     a(paramaqu, parambjb, 1, 2, 5, 2, 3, 5, aty.f.P(), aty.f.P(), false);
/*   52:1364 */     a(paramaqu, parambjb, 0, 4, 1, 8, 4, 1, aty.f.P(), aty.f.P(), false);
/*   53:1365 */     a(paramaqu, parambjb, 0, 4, 4, 3, 4, 4, aty.f.P(), aty.f.P(), false);
/*   54:1366 */     a(paramaqu, parambjb, 0, 5, 2, 8, 5, 3, aty.f.P(), aty.f.P(), false);
/*   55:1367 */     a(paramaqu, aty.f.P(), 0, 4, 2, parambjb);
/*   56:1368 */     a(paramaqu, aty.f.P(), 0, 4, 3, parambjb);
/*   57:1369 */     a(paramaqu, aty.f.P(), 8, 4, 2, parambjb);
/*   58:1370 */     a(paramaqu, aty.f.P(), 8, 4, 3, parambjb);
/*   59:1371 */     a(paramaqu, aty.f.P(), 8, 4, 4, parambjb);
/*   60:     */     
/*   61:1373 */     int i = a(aty.ad, 3);
/*   62:1374 */     int j = a(aty.ad, 2);
/*   63:1375 */     for (int k = -1; k <= 2; k++) {
/*   64:1376 */       for (m = 0; m <= 8; m++)
/*   65:     */       {
/*   66:1377 */         a(paramaqu, aty.ad.a(i), m, 4 + k, k, parambjb);
/*   67:1378 */         if (((k > -1) || (m <= 1)) && ((k > 0) || (m <= 3)) && ((k > 1) || (m <= 4) || (m >= 6))) {
/*   68:1379 */           a(paramaqu, aty.ad.a(j), m, 4 + k, 5 - k, parambjb);
/*   69:     */         }
/*   70:     */       }
/*   71:     */     }
/*   72:1385 */     a(paramaqu, parambjb, 3, 4, 5, 3, 4, 10, aty.f.P(), aty.f.P(), false);
/*   73:1386 */     a(paramaqu, parambjb, 7, 4, 2, 7, 4, 10, aty.f.P(), aty.f.P(), false);
/*   74:1387 */     a(paramaqu, parambjb, 4, 5, 4, 4, 5, 10, aty.f.P(), aty.f.P(), false);
/*   75:1388 */     a(paramaqu, parambjb, 6, 5, 4, 6, 5, 10, aty.f.P(), aty.f.P(), false);
/*   76:1389 */     a(paramaqu, parambjb, 5, 6, 3, 5, 6, 10, aty.f.P(), aty.f.P(), false);
/*   77:1390 */     k = a(aty.ad, 0);
/*   78:1391 */     for (int m = 4; m >= 1; m--)
/*   79:     */     {
/*   80:1392 */       a(paramaqu, aty.f.P(), m, 2 + m, 7 - m, parambjb);
/*   81:1393 */       for (n = 8 - m; n <= 10; n++) {
/*   82:1394 */         a(paramaqu, aty.ad.a(k), m, 2 + m, n, parambjb);
/*   83:     */       }
/*   84:     */     }
/*   85:1397 */     m = a(aty.ad, 1);
/*   86:1398 */     a(paramaqu, aty.f.P(), 6, 6, 3, parambjb);
/*   87:1399 */     a(paramaqu, aty.f.P(), 7, 5, 4, parambjb);
/*   88:1400 */     a(paramaqu, aty.ad.a(m), 6, 6, 4, parambjb);
/*   89:     */     int i1;
/*   90:1401 */     for (int n = 6; n <= 8; n++) {
/*   91:1402 */       for (i1 = 5; i1 <= 10; i1++) {
/*   92:1403 */         a(paramaqu, aty.ad.a(m), n, 12 - n, i1, parambjb);
/*   93:     */       }
/*   94:     */     }
/*   95:1408 */     a(paramaqu, aty.r.P(), 0, 2, 1, parambjb);
/*   96:1409 */     a(paramaqu, aty.r.P(), 0, 2, 4, parambjb);
/*   97:1410 */     a(paramaqu, aty.bj.P(), 0, 2, 2, parambjb);
/*   98:1411 */     a(paramaqu, aty.bj.P(), 0, 2, 3, parambjb);
/*   99:     */     
/*  100:1413 */     a(paramaqu, aty.r.P(), 4, 2, 0, parambjb);
/*  101:1414 */     a(paramaqu, aty.bj.P(), 5, 2, 0, parambjb);
/*  102:1415 */     a(paramaqu, aty.r.P(), 6, 2, 0, parambjb);
/*  103:     */     
/*  104:1417 */     a(paramaqu, aty.r.P(), 8, 2, 1, parambjb);
/*  105:1418 */     a(paramaqu, aty.bj.P(), 8, 2, 2, parambjb);
/*  106:1419 */     a(paramaqu, aty.bj.P(), 8, 2, 3, parambjb);
/*  107:1420 */     a(paramaqu, aty.r.P(), 8, 2, 4, parambjb);
/*  108:1421 */     a(paramaqu, aty.f.P(), 8, 2, 5, parambjb);
/*  109:1422 */     a(paramaqu, aty.r.P(), 8, 2, 6, parambjb);
/*  110:1423 */     a(paramaqu, aty.bj.P(), 8, 2, 7, parambjb);
/*  111:1424 */     a(paramaqu, aty.bj.P(), 8, 2, 8, parambjb);
/*  112:1425 */     a(paramaqu, aty.r.P(), 8, 2, 9, parambjb);
/*  113:1426 */     a(paramaqu, aty.r.P(), 2, 2, 6, parambjb);
/*  114:1427 */     a(paramaqu, aty.bj.P(), 2, 2, 7, parambjb);
/*  115:1428 */     a(paramaqu, aty.bj.P(), 2, 2, 8, parambjb);
/*  116:1429 */     a(paramaqu, aty.r.P(), 2, 2, 9, parambjb);
/*  117:     */     
/*  118:1431 */     a(paramaqu, aty.r.P(), 4, 4, 10, parambjb);
/*  119:1432 */     a(paramaqu, aty.bj.P(), 5, 4, 10, parambjb);
/*  120:1433 */     a(paramaqu, aty.r.P(), 6, 4, 10, parambjb);
/*  121:1434 */     a(paramaqu, aty.f.P(), 5, 5, 10, parambjb);
/*  122:     */     
/*  123:     */ 
/*  124:1437 */     a(paramaqu, aty.a.P(), 2, 1, 0, parambjb);
/*  125:1438 */     a(paramaqu, aty.a.P(), 2, 2, 0, parambjb);
/*  126:1439 */     a(paramaqu, aty.aa.P().a(bbl.a, this.m), 2, 3, 1, parambjb);
/*  127:1440 */     a(paramaqu, parambjb, paramRandom, 2, 1, 0, ej.b(a(aty.ao, 1)));
/*  128:1441 */     a(paramaqu, parambjb, 1, 0, -1, 3, 2, -1, aty.a.P(), aty.a.P(), false);
/*  129:1442 */     if ((a(paramaqu, 2, 0, -1, parambjb).c().r() == bof.a) && (a(paramaqu, 2, -1, -1, parambjb).c().r() != bof.a)) {
/*  130:1443 */       a(paramaqu, aty.aw.a(a(aty.aw, 3)), 2, 0, -1, parambjb);
/*  131:     */     }
/*  132:1446 */     for (n = 0; n < 5; n++) {
/*  133:1447 */       for (i1 = 0; i1 < 9; i1++)
/*  134:     */       {
/*  135:1448 */         b(paramaqu, i1, 7, n, parambjb);
/*  136:1449 */         b(paramaqu, aty.e.P(), i1, -1, n, parambjb);
/*  137:     */       }
/*  138:     */     }
/*  139:1452 */     for (n = 5; n < 11; n++) {
/*  140:1453 */       for (i1 = 2; i1 < 9; i1++)
/*  141:     */       {
/*  142:1454 */         b(paramaqu, i1, 7, n, parambjb);
/*  143:1455 */         b(paramaqu, aty.e.P(), i1, -1, n, parambjb);
/*  144:     */       }
/*  145:     */     }
/*  146:1459 */     a(paramaqu, parambjb, 4, 1, 2, 2);
/*  147:     */     
/*  148:1461 */     return true;
/*  149:     */   }
/*  150:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bnm
 * JD-Core Version:    0.7.0.1
 */