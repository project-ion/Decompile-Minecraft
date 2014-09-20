/*  1:   */ public class boh
/*  2:   */ {
/*  3: 4 */   public static final boh[] a = new boh[64];
/*  4: 6 */   public static final boh b = new boh(0, 0);
/*  5: 7 */   public static final boh c = new boh(1, 8368696);
/*  6: 8 */   public static final boh d = new boh(2, 16247203);
/*  7: 9 */   public static final boh e = new boh(3, 10987431);
/*  8:10 */   public static final boh f = new boh(4, 16711680);
/*  9:11 */   public static final boh g = new boh(5, 10526975);
/* 10:12 */   public static final boh h = new boh(6, 10987431);
/* 11:13 */   public static final boh i = new boh(7, 31744);
/* 12:14 */   public static final boh j = new boh(8, 16777215);
/* 13:15 */   public static final boh k = new boh(9, 10791096);
/* 14:16 */   public static final boh l = new boh(10, 12020271);
/* 15:17 */   public static final boh m = new boh(11, 7368816);
/* 16:18 */   public static final boh n = new boh(12, 4210943);
/* 17:19 */   public static final boh o = new boh(13, 6837042);
/* 18:20 */   public static final boh p = new boh(14, 16776437);
/* 19:21 */   public static final boh q = new boh(15, 14188339);
/* 20:22 */   public static final boh r = new boh(16, 11685080);
/* 21:23 */   public static final boh s = new boh(17, 6724056);
/* 22:24 */   public static final boh t = new boh(18, 15066419);
/* 23:25 */   public static final boh u = new boh(19, 8375321);
/* 24:26 */   public static final boh v = new boh(20, 15892389);
/* 25:27 */   public static final boh w = new boh(21, 5000268);
/* 26:28 */   public static final boh x = new boh(22, 10066329);
/* 27:29 */   public static final boh y = new boh(23, 5013401);
/* 28:30 */   public static final boh z = new boh(24, 8339378);
/* 29:31 */   public static final boh A = new boh(25, 3361970);
/* 30:32 */   public static final boh B = new boh(26, 6704179);
/* 31:33 */   public static final boh C = new boh(27, 6717235);
/* 32:34 */   public static final boh D = new boh(28, 10040115);
/* 33:35 */   public static final boh E = new boh(29, 1644825);
/* 34:36 */   public static final boh F = new boh(30, 16445005);
/* 35:37 */   public static final boh G = new boh(31, 6085589);
/* 36:38 */   public static final boh H = new boh(32, 4882687);
/* 37:39 */   public static final boh I = new boh(33, 55610);
/* 38:40 */   public static final boh J = new boh(34, 1381407);
/* 39:41 */   public static final boh K = new boh(35, 7340544);
/* 40:   */   public final int L;
/* 41:   */   public final int M;
/* 42:   */   
/* 43:   */   private boh(int paramInt1, int paramInt2)
/* 44:   */   {
/* 45:47 */     if ((paramInt1 < 0) || (paramInt1 > 63)) {
/* 46:48 */       throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/* 47:   */     }
/* 48:50 */     this.M = paramInt1;
/* 49:51 */     this.L = paramInt2;
/* 50:52 */     a[paramInt1] = this;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int a(int paramInt)
/* 54:   */   {
/* 55:56 */     int i1 = 220;
/* 56:57 */     if (paramInt == 3) {
/* 57:58 */       i1 = 135;
/* 58:   */     }
/* 59:60 */     if (paramInt == 2) {
/* 60:61 */       i1 = 255;
/* 61:   */     }
/* 62:63 */     if (paramInt == 1) {
/* 63:64 */       i1 = 220;
/* 64:   */     }
/* 65:66 */     if (paramInt == 0) {
/* 66:67 */       i1 = 180;
/* 67:   */     }
/* 68:70 */     int i2 = (this.L >> 16 & 0xFF) * i1 / 255;
/* 69:71 */     int i3 = (this.L >> 8 & 0xFF) * i1 / 255;
/* 70:72 */     int i4 = (this.L & 0xFF) * i1 / 255;
/* 71:   */     
/* 72:74 */     return 0xFF000000 | i2 << 16 | i3 << 8 | i4;
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     boh
 * JD-Core Version:    0.7.0.1
 */